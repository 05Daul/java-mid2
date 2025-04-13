package comparable;

import java.util.Arrays;

public class SortMain1 {

  public static void main(String[] args) {
    Integer[] a = {1,3,5,6,2,4,9};
    System.out.println(Arrays.toString(a));
    System.out.println(" 기본 정렬  " );
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));

  }

}
