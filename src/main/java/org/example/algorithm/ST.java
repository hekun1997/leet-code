package org.example.algorithm;

public class ST<Key extends Comparable<Key>, Value> {
    void put (Key key, Value value) {

    }

    Value get(Key key) {
        return null;
    }

    void delete(Key key) {
        put(key, null);
    }

    boolean contains(Key key) {
        return get(key) != null;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int size() {
        return 0;
    }

    int size(Key low, Key high) {
        if (high.compareTo(low) < 0) {
            return 0;
        } else if (contains(high)) {
            return rank(high) - rank(low) + 1;
        } else {
            return rank(high) - rank(low);
        }
    }

    Iterable<Key> keys() {
        return null;
    }

    Iterable<Key> keys(Key low, Key high) {
        return null;
    }

    Key min() {
        return null;
    }

    Key max() {
        return null;
    }

    Key floor() {
        return null;
    }

    Key ceiling() {
        return null;
    }

    int rank(Key key) {
        return 0;
    }

    Key select(int k) {
        return null;
    }

    void deleteMin() {
        delete(min());
    }

    void deleteMax() {
        delete(max());
    }
}
