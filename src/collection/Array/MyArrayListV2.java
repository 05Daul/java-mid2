package collection.Array;

import java.util.Arrays;

public class MyArrayListV2 {

  /// 동적 배열
  private static final int DEAFULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV2() {
    elementData = new Object[DEAFULT_CAPACITY];
  }

  public MyArrayListV2(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    /// 코드추가
    // 1. 배열의 길이를 확인
    if (size == elementData.length) {
      //2. 최대치에 도달했으면 늘려주기.
      grow();
    }
    elementData[size] = e;
    size++;
  }

    /// 코드 추가
  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2;
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  public Object get(int index) {
    return elementData[index];
  }

  public Object set(int indexm, Object element) {
    Object old = elementData[indexm];
    elementData[indexm] = element;
    return old;
  }

  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (elementData[i].equals(o)) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) + " size :" + size
        + ", capacity :" + elementData.length;
  }
}
