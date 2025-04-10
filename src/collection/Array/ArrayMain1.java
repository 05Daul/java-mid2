package collection.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain1 {

  public static void main(String[] args) {
    int[] arr = new int[10];
    /// index 입력 O(1) : O(1)
    System.out.println(" index 입력 : O(1) "  );
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    System.out.println(Arrays.toString(arr));

    /// index 변경 O(1) : O(1)
    System.out.println(" index 변경: O(1) "  );
    arr[1] = 12;
    arr[2] = 13;
    System.out.println(Arrays.toString(arr));
    /// index 조회 O(1) : O(1)
    System.out.println(" index 조회: O(1) "  );
    System.out.println("arr[2]를 조회 = " + arr[2]);

    /// 배열 검색
    System.out.println(" index 배열 검색: O(n) "  );
    System.out.println(Arrays.toString(arr));
    int  y = 13;
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" +i+"] :" + arr[i]);
      if (arr[i] == y) {
        System.out.println(" 값을 찾음 " );
        break;
      }
    }
  }
}
