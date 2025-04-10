package collection.Array;

import java.util.Arrays;

public class MyArrayListV4<E> {

  ///  V2-> V3 add, remove 를 추가
  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV4() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV4(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  /// 코드추가
  public void add(int index, E e) {
    if (size == elementData.length) {
      grow();
    }
    shiftRightFrom(index);
    elementData[index] = e;
    size++;
  }

  private void shiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  public E remove(int index) {
    E old = get(index);
    shiftLeftFrom(index);
    elementData[--size] = null;
    return old;
  }

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

  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) elementData[index];
  }

  public E set(int index, E element) {
    E old = get(index);
    elementData[index] = element;
    return old;
  }

  public int indexOf(E o) {
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
