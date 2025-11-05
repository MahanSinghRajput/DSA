package Collections;
class MyPair<K, V> {
    private K key;
    private V value;

    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPair)) return false;
        MyPair<?, ?> pair = (MyPair<?, ?>) o;
        return (key == null ? pair.key == null : key.equals(pair.key)) &&
                (value == null ? pair.value == null : value.equals(pair.value));
    }

    @Override
    public int hashCode() {
        int result = (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
public class pair {
    public static void main(String[] args) {
        MyPair<String, Integer> p = new MyPair<>("age", 25);
        System.out.println(p); // Output: Pair{key=age, value=25}
    }
}
