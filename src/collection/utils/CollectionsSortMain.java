package collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(91);
    list.add(11);
    list.add(13);
    list.add(4);
    list.add(25);
    list.add(76);
    list.add(7);
    System.out.println("list = " + list);
    Integer max = Collections.max(list);
    Integer min = Collections.min(list);
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println();
    System.out.println("list 셔플 전= " + list);
    Collections.shuffle(list);
    System.out.println("list 셔플 후= " + list);
    Collections.sort(list);
    System.out.println("정렬 list = " + list);
    Collections.reverse(list);
    System.out.println("역정렬 list = " + list);
  }
}
