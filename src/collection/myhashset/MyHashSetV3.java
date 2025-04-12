package collection.myhashset;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV3<E>  implements MySet<E> {

  static final int DEFAULT_INITIAL_CAPACITY = 10;

  private LinkedList<E>[] buckets;

  private int size;
  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV3() {
    initBuckets();
  }

  public MyHashSetV3(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  public void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();

    }
  }

  public boolean add(E value) {
    int hashindex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashindex];
    if (bucket.contains(value)) {
      return false;
    }
    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(E searchValue) {
    int hashindex = hashIndex(searchValue);
    LinkedList<E> bucket = buckets[hashindex];
    return bucket.contains(searchValue);
  }

  public boolean remove(E searchValue) {
    int hashindex = hashIndex(searchValue);
    LinkedList<E> bucket = buckets[hashindex];
    boolean result = bucket.remove(searchValue);
    if (result) {
      size--;
      return true;
    } else {
      return false;
    }
  }

  public  int size() {
    return size;
  }

  private int hashIndex(Object value) {
    int hashCode = value.hashCode();
    ///  음수 일 경우 절댓값
    int hashIndex = Math.abs(hashCode) % capacity;

    return hashIndex;
  }

  @Override
  public String toString() {
    return "MyHashSetV3{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyHashSetV3 that = (MyHashSetV3) o;
    return size == that.size && capacity == that.capacity && Objects.deepEquals(buckets,
        that.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(buckets), size, capacity);
  }
}
