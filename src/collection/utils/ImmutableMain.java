package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

  public static void main(String[] args) {
    /// 불변 리스트 생성
    List<Integer> list = List.of(1, 2, 3, 4, 5);

    /// 가변 리스트
    ArrayList<Integer> list2 = new ArrayList<>(list);
    list2.add(6);
    System.out.println(" 불변 리스트를 더한 list2 = " + list2);
    System.out.println(list2.getClass());

/// 가변 -> 불변 리스트로
    Collection<Integer> unmodifiableTable = Collections.unmodifiableCollection(list2);
    System.out.println(unmodifiableTable.getClass());

  }

}
