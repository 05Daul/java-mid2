package collection.set.javaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

  public static void main(String[] args) {

    Set<Object> hsahSet = new HashSet<>();
    Set<Object> LinkedHashSet = new LinkedHashSet<>();
    Set<Object> Trddset = new TreeSet<>();

    // 데이터 값의 순서, 입력한 순서 보장X --> 해시 기반으로 무작위 순서
    run(new HashSet<>());
    // 데이터 입력의 순서
    run(new LinkedHashSet<>());
    // 데이터 값의 순서
    run(new TreeSet<>());
  }

  public static void run(Set<String> set) {
    System.out.println("set.getClass() = " + set.getClass());
    set.add("a");
    set.add("e");
    set.add("g");

    set.add("c");
    set.add("f");
    set.add("d");
    set.add("b");
    System.out.println("set = " + set);

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
  }
}
