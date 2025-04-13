package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

  public static void main(String[] args) {

    MyUser user1 = new MyUser("A",30);
    MyUser user2 = new MyUser("B",20);
    MyUser user3 = new MyUser("C",31);
    MyUser user4 = new MyUser("D",19);
    MyUser[] arr = new MyUser[]{user1,user2,user3,user4};
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    System.out.println(" comparable 기본 정렬 " );
    Arrays.sort(arr);
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    System.out.println(" IdComparator 정렬 " );
    Arrays.sort(arr,new IdComparator());
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

  }
}
