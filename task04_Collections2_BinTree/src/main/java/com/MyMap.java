package com;

import java.util.Set;

public interface MyMap<K, V> {
    /**
     * Removes all of the mappings from this map.
     */
    void clear();

    /**
     * Returns true if this map contains a mapping for the specified key.
     */
    boolean containsKey(K key);

    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     */
    V get(K key);

    /**
     * Returns the number of key-value mappings in this map.
     */
    int size();

    /**
     * Associates the specified value with the specified key in this map.
     */
    void put(K key, V value);

    /**
     * Removes the mapping for the specified key from this map if present.
     */
    V remove(K key);

    /**
     * Removes the entry for the specified key only if it is currently mapped to
     * the specified value.
     */
    V remove(K key, V value);

    /**
     * Returns a Set view of the keys contained in this map.
     */
    Set<K> keySet();
}
