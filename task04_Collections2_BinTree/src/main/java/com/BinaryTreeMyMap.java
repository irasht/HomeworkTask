package com;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class BinaryTreeMyMap<K extends Comparable<K>, V> implements MyMap<K, V> {
    private Node root;
    private int size;

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        if (get(key) == null)
            return false;
        else
            return true;
    }

    @Override
    public V get(K key) {
        if (root == null) {
            return null;
        }

        Node<K, V> node = root.find(key);
        if (node == null)
            return null;
        else
            return node.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(K key, V value) {
        if (root == null) {
            root = new Node(key, value);
            size = 1;
        } else {
            root.insert(key, value);
            size += 1;
        }
    }

    @Override
    public V remove(K key) {
        V value = get(key);
        if (value == null) {
            return null;
        } else {
            root = root.remove(key);
            size -= 1;
            return value;
        }
    }

    @Override
    public V remove(K key, V value) {
        V testValue = get(key);
        if (testValue == null || testValue != value) {
            return null;
        } else {
            root = root.remove(key);
            size -= 1;
            return value;
        }
    }

    @Override
    public Set<K> keySet() {
        if (root == null)
            return null;
        else
            return new HashSet<K>(root.inOrder(new ArrayList<K>()));
    }

    public void printInOrder() {
        List<K> keys = getKeysInOrder();
        for (int i = 0; i < keys.size(); i += 1) {
            System.out.println(keys.get(i));
        }
    }

    public List<K> getKeysInOrder() {
        if (root == null)
            return null;

        return root.inOrder(new ArrayList<K>());
    }

    @Override
    public String toString() {
        return "BinaryTreeMyMap{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}
