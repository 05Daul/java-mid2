package Iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JavaIterableMain {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    printAll(list);
    HashSet<Integer> sets = new HashSet<>();
    sets.add(1);
    sets.add(2);
    sets.add(3);
    sets.add(4);
    printAll(sets);
  }
  private static void printAll(Iterable<Integer> iterable) {
    System.out.println("iterable.getClass() = " + iterable.getClass());

    Iterator<Integer> iterator = iterable.iterator(); // 한번만 생성
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
