package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {

  public static void main(String[] args) {

    MyUser user1 = new MyUser("A", 30);
    MyUser user2 = new MyUser("B", 20);
    MyUser user3 = new MyUser("C", 31);
    MyUser user4 = new MyUser("D", 19);
    TreeSet<MyUser> treeSet1 = new TreeSet<>();
    treeSet1.add(user1);
    treeSet1.add(user2);
    treeSet1.add(user3);
    treeSet1.add(user4);
    System.out.println(" Comparable 정렬 "  );
    System.out.println("treeSet1 = " + treeSet1);

    TreeSet<MyUser> treeset2 = new TreeSet<>(new IdComparator());
    treeset2.add(user1);
    treeset2.add(user2);
    treeset2.add(user3);
    treeset2.add(user4);
    System.out.println(" IdComparable 정렬 "  );
    System.out.println("treeSet2 = " + treeset2);

  }
}
