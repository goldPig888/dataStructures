import java.util.ArrayList;

public class MyMap<K, V> implements MapInterface<K, V> {
    private MySet<MapEnt<K, V>> set;

    public MyMap() {
        set = new MySet<>();
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean containsKey(K key) {
        for (MapEnt<K, V> ent : set) {
            if (ent.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (MapEnt<K, V> ent : set) {
            if (ent.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public MySet<MapEnt<K, V>> entrySet() {
        return set;
    }

    @Override
    public V get(K o) {
        for (MapEnt<K, V> ent : set) {
            if (ent.getKey().equals(o)) {
                return ent.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public V put(K key, V value) {
        for (MapEnt<K, V> ent : set) {
            if (ent.getKey().equals(key)) {
                V temp = ent.getValue();
                ent.setValue(value);
                return temp;
            }
        }
        set.add(new MapEnt<>(key, value));
        return null;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public MySet<K> keySet() {
        MySet<K> keys = new MySet<>();
        for (MapEnt<K, V> ent : set) {
            keys.add(ent.getKey());
        }
        return keys;
    }

    @Override
    public ArrayList<V> values() {
        ArrayList<V> values = new ArrayList<>();
        for (MapEnt<K, V> ent : set) {
            values.add(ent.getValue());
        }
        return values;
    }

    @Override
    public V remove(K key) {
        for (MapEnt<K, V> ent : set) {
            if (ent.getKey().equals(key)) {
                V temp = ent.getValue();
                set.remove(ent);
                return temp;
            }
        }
        return null;
    }
}