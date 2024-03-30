package Map;

import java.util.ArrayList;

public class MyMap<K, V> {
    private final ArrayList<K> keys;
    private final ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(index, value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null;
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}