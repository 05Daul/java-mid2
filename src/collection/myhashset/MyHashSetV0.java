package collection.myhashset;

import java.util.Arrays;

public class MyHashSetV0 {

  private int[] elementsData = new int[10];
  private int size = 0;

  // O(N)
  public boolean add(int value) {
    if (contains(value)) {
      return false;
    }
    elementsData[size] = value;
    size++;
    return true;
  }

  // O(N)
  public boolean contains(int value) {
    for (int data : elementsData) {
      if (data == value) {
        return true;
      }
    }
    return false;
  }

  public int[] getElementsData() {
    return elementsData;
  }

  public void setElementsData(int[] elementsData) {
    this.elementsData = elementsData;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "MyHashSetV0{" +
        "elementsData=" + Arrays.toString(elementsData) +
        ", size=" + size +
        '}';
  }
}
