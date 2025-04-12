package collection.framework.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

  public static void main(String[] args) {
    List<Integer> students = new ArrayList<>();
    students.add(90);
    students.add(80);
    students.add(70);
    students.add(60);
    students.add(50);
    students.add(40);
    students.add(30);
    System.out.println(students);
//    int[] students = {90, 80, 70, 60, 50, 40, 30};

    int total = 0;
    for (int i = 0; i < students.size(); i++) {
      total += students.get(i);
    }

    double average = total / students.size();
    System.out.println("합계 = " + total);
    System.out.println("평균 = " + average);
  }
}
