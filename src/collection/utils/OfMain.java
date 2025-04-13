package collection.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

  public static void main(String[] args) {
    /// 편리한 불변 컬렉션 생성
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Map<Integer,String> map = Map.of(1,"one",2,"two",3,"three",4,"four",5,"five");
    System.out.println(list);
    System.out.println(set);
    System.out.println(map);

  }

}
