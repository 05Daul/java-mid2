package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

  public static void main(String[] args) {
    Integer[] a = {3, 2, 1};
    System.out.println(Arrays.toString(a));
    System.out.println(" 기본 정렬  ");
    System.out.println(" Comparator 비교 ");

    Arrays.sort(a, new AscSort());
    System.out.println(" Asc " + Arrays.toString(a));
    Arrays.sort(a, new DescSort());
    System.out.println(" Desc " + Arrays.toString(a));



  }

  static class AscSort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      System.out.println("o1 = " + o1 + " o2 = " + o2);
      return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }
  }

  static class DescSort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      System.out.println("o1 = " + o1 + " o2 = " + o2);
      return (o1 > o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }
  }
}
