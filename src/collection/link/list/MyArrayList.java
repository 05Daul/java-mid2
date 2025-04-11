package collection.link.list;

import java.util.Arrays;

public class MyArrayList<E> implements Mylist<E> {

  ///  V2-> V3 add, remove 를 추가
  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  @Override
  public int size() {
    return size;
  }
  @Override
  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  /// 코드추가
   @Override
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
  @Override
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
  @Override
  public E get(int index) {
    return (E) elementData[index];
  }
  @Override
  public E set(int index, E element) {
    E old = get(index);
    elementData[index] = element;
    return old;
  }
  @Override
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
