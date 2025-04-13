package Iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
/// 배열을 접근해서 반복하는 Iterator

private int currentIndex = -1;
private int[] targetarray;

  public MyArrayIterator(int[] targetarray) {
    this.targetarray = targetarray;
  }

  @Override
  public boolean hasNext() {
    return  currentIndex < targetarray.length - 1;
  }

  @Override
  public Integer next() {
    currentIndex++;
    int result = targetarray[currentIndex];
    return result;
  }
}
