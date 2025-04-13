package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
/// 값은 키로 value를 각각 저장한다면?
  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("stuA", 100);
    studentMap.put("stuA", 90);
    System.out.println("studentMap = " + studentMap);

    // 특정 학생의 값을 조회
    Integer stuA = studentMap.get("stuA");
    System.out.println("stuA = " + stuA);
  }

}
