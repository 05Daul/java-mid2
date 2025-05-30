package collection.myhashset;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

  static final int DEFAULT_INITIAL_CAPACITY = 10;

  LinkedList<Integer>[] buckets;

  private int size;
  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV1() {
    initBuckets();
  }

  public MyHashSetV1(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  public void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();

    }
  }

  public boolean add(int value) {
    int hashindex = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hashindex];
    if (bucket.contains(value)) {
      return false;
    }
    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(int searchValue) {
    int hashindex = hashIndex(searchValue);
    LinkedList<Integer> bucket = buckets[hashindex];
    return bucket.contains(searchValue);
  }

  public boolean remove(int searchValue) {
    int hashindex = hashIndex(searchValue);
    LinkedList<Integer> bucket = buckets[hashindex];
    boolean result = bucket.remove(Integer.valueOf(searchValue));
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
  private int hashIndex(int value) {
    return value % capacity;
  }

  @Override
  public String toString() {
    return "MyHashSetV1{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
