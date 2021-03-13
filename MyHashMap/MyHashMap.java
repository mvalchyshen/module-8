package module8.HomeWork.MyHashMap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> {

    private MyNode<K, V>[] table;
    private int size;
    private float threshold;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int INITIAL_CAPACITY = 16;

    public MyHashMap() {
        table = new MyNode[INITIAL_CAPACITY];
        threshold = INITIAL_CAPACITY * LOAD_FACTOR;
        size = 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            putForNullKey(value);
        } else {
          int hash = hash(key);
          int index = indexOf(hash, table.length);
          addMyNode(key,value, index, hash);
        }
    }

    private void putForNullKey(V value) {
        addMyNode(null, value, 0, 0);
    }

    private void addMyNode(K key, V value, int index, int hash) {
        MyNode<K, V> newEl = new MyNode<>(hash, key, value, null);
        MyNode<K, V> cur = table[index];
        if (cur == null) {
            table[index] = newEl;
        } else {
            while (cur != null) {
                if (cur.hash == hash && (Objects.equals(cur.key, key))) {
                    cur.value = value;
                }
                if (cur.getNext() != null) {
                    cur = cur.getNext();
                } else {
                    break;
                }
            }
            cur.setNext(newEl);
        }
        if (++size > threshold) {
            resize();
        }
    }

    private void resize() {
        table = Arrays.copyOf(table, table.length * 2);
    }

    private int indexOf(int hash, int length) {
        return hash & (length - 1);
    }

    private int hash(K key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    public void remove(K key) {
        int index = hash(key);
        MyNode<K, V> prev =null;
        MyNode<K, V> entry = table[index];
        while (entry != null) {
            if(entry.getKey().equals(key)){
                if(prev == null){
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                }else {
                    prev.setNext(entry.getNext());
                    return;
                }
            }
            prev = entry;
            entry = entry.getNext();
        }
    }
    public void clear() {
        table = new MyNode[INITIAL_CAPACITY];
        size = 0;
    }
    public int size() {
        return size;
    }

    public V get(K key) {
        V value = null;
        int index = indexOf(hash(key), table.length);
        MyNode<K, V> entry = table[index];
        while (entry != null) {
            if (entry.getKey() == key || (key != null && key.equals(key))) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (MyNode<K, V> entry:table) {
            if (entry != null){
            sb.append(entry);
            sb.append(", ");}

        }
        return sb.append("}").toString();
    }

    private static class MyNode<K, V> {
        int hash;
        private K key;
        private V value;
        private MyNode<K, V> next;

        public MyNode(int hash, K key, V value, MyNode<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public MyNode<K, V> getNext() {
            return next;
        }

        public void setNext(MyNode<K, V> next) {
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyNode<?, ?> myNode = (MyNode<?, ?>) o;
            return Objects.equals(key, myNode.key) && Objects.equals(value, myNode.value);
        }


        @Override
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
    }
}
