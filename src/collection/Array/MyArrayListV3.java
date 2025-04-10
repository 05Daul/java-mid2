package collection.Array;

import java.util.Arrays;

public class MyArrayListV3 {

  ///  V2-> V3
  /// add, remove 를 추가
  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV3() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV3(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }
  /// 코드추가
  ///
  public void add(int index,Object e) {
    if (size == elementData.length) {
      grow();
    }
    /// 데이터 이동
    shiftRightFrom(index);
    elementData[index] = e;
    size++;
  }

  /// 코드추가
  private void shiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  /// 코드 추가
  public  Object remove(int index) {
    Object old = get(index);
    shiftLeftFrom(index);
    elementData[--size] = null;
    return old;
  }

  /// 코드추가
  private void shiftLeftFrom(int index) {
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }
  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2;
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  public Object get(int index) {
    return elementData[index];
  }

  public Object set(int index, Object element) {
    Object old = elementData[index];
    elementData[index] = element;
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
