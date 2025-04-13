package comparable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

  public static void main(String[] args) {

    MyUser user1 = new MyUser("A", 30);
    MyUser user2 = new MyUser("B", 20);
    MyUser user3 = new MyUser("C", 31);
    MyUser user4 = new MyUser("D", 19);
    List<MyUser> list = new LinkedList<>(Arrays.asList(user1, user2, user3, user4));
    System.out.println(" 기본 데이터 " );
    System.out.println("list = " + list);
    System.out.println("1. Comparable 기본 정렬 " );
    list.sort(null);
    System.out.println("1) 정렬된 list = " + list);

    System.out.println("2. IdComparator 정렬 "  );

    list.sort(new IdComparator());
    System.out.println("1) 정렬된 list = " + list);


    list.sort(new IdComparator().reversed());
    System.out.println("2) 역정렬된 list = " + list);
  }
}
