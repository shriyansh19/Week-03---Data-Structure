package sampleproblems.hashmaps.customhashmap;

import java.util.*;

class CustomHashMap<K, V> {
    private final int SIZE = 1000;
    private List<List<Node<K, V>>> buckets;

    public CustomHashMap() {
        buckets = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (Node<K, V> node : buckets.get(index)) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        buckets.get(index).add(new Node<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        for (Node<K, V> node : buckets.get(index)) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        buckets.get(index).removeIf(node -> node.key.equals(key));
    }

    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
