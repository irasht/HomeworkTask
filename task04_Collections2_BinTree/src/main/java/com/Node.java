package com;

import java.util.*;
import java.security.InvalidParameterException;

class Node<K extends Comparable<K>, V> {
    private Node left;
    private Node right;
    private K key;
    private V value;

    public List<K> inOrder(List<K> list) {
        if (left != null)
            left.inOrder(list);
        list.add(key);
        if (right != null)
            right.inOrder(list);
        return list;
    }

    /**
     * Private constructor to force all Node creation to be done by the insert method.
     */
    private Node(K key, V value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * A leaf Node with given key/value
     */
    public Node(K key, V value) {
        this(key, value, null, null);
    }

    /**
     * Fetches the value of this Node.
     */
    public V getValue() {
        return value;
    }

    /**
     * Fetches the value of this Node.
     */
    public K getKey() {
        return key;
    }

    /**
     * Fetches the left child of this.
     */
    public Node left() {
        return left;
    }

    /**
     * Fetches the right child of this.
     */
    public Node right() {
        return right;
    }

    /**
     * The highest Node that contains the label, or null.
     */
    public Node find(K key) {
        if (key == null)
            return null;

        if (key.equals(this.key))
            return this;

        if (key.compareTo(this.key) < 0) {
            if (left != null)
                return left.find(key);
            else
                return null;
        } else {
            if (right != null)
                return right.find(key);
            else
                return null;
        }

    }

    /**
     * Insert the key/value into tree, returning the modified tree.
     */
    public Node insert(K key, V val) {
        if (key == null)
            throw new InvalidParameterException("Cannot insert null key");

        if (key.equals(this.key))
            throw new InvalidParameterException("Cannot insert duplicate key");

        if (key.compareTo(this.key) < 0) {
            if (left == null) {
                left = new Node(key, val);
            } else {
                left = left.insert(key, val);
            }
        } else {
            if (right == null) {
                right = new Node(key, val);
            } else {
                right = right.insert(key, val);
            }
        }
        return this;
    }

    /**
     * Delete the instance of label from tree that is closest to to the root
     * and return the modified tree.
     */
    public Node remove(K key) {
        if (key == null)
            throw new InvalidParameterException("Cannot remove null key");

        if (key.equals(this.key)) {

            if (left == null && right == null)
                return null;

            if (left == null && right != null)
                return right;

            if (left != null && right == null)
                return left;
            Node tracker = right;
            while (tracker.left != null) {
                tracker = tracker.left;
            }
            this.key = (K) tracker.getKey();
            value = (V) tracker.getValue();
            right = right.remove(this.key);
            return this;
        }

        if (key.compareTo(this.key) < 0) {
            left = left.remove(key);
        } else {
            right = right.remove(key);
        }
        return this;

    }
}
