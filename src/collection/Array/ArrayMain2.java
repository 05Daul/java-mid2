package collection.Array;

import java.util.Arrays;

public class ArrayMain2 {

  public static void main(String[] args) {
    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    // 배열의 첫 번째 위치에 추가
    // 기본 배열의 데이터를 한칸씩 뒤로 미루고, 배열의 첫 번째 위치에 추가
    System.out.println(" 배열의 첫 번째 위치에 3을 추가 O(n) " );
    int newValue =10;
    addFirst(arr,newValue);

    /// index 위치에 추가
    // 기본 배열의 데이터를 한 칸씩 미루고, 배열의 index 위치에 추가
    newValue = 99;
    int index = 3;
    addAtIndex(arr,index,newValue);

    /// 배열의 마지막에 숫자를 추가
    newValue = 100;
    addLast(arr,newValue);
  }

  private static void addFirst(int[] arr, int newValue) {
    for (int i = arr.length-1; i > 0 ; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = newValue;
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
  }

  private static void addAtIndex(int[] arr, int index, int newValue) {
    for (int i = arr.length-1; i > index ; i--) {
      arr[i] = arr[i-1];
    }
    arr[index] = newValue;
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
  }
  private static void addLast(int[] arr, int newValue) {
    arr[arr.length-1] = newValue;
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

  }

}
