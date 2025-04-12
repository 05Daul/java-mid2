package collection.framework.test.ex1;

public class ArrayEx1 {

  public static void main(String[] args) {

    int[] students = {90, 80, 70, 60, 50, 40, 30};

    int total = 0;
    for (int i = 0; i < students.length; i++) {
      total += students[i];
    }
    double average = total / students.length;
    System.out.println("합계 = " + total);
    System.out.println("평균 = " + average);
  }

}
