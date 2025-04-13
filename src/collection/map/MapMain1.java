package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();
    /// 학생의 성적 데이터 입력 + 순서보장을 하지 않음
    studentMap.put("stuA", 100);
    studentMap.put("stuB", 90);
    studentMap.put("stuC", 70);
    studentMap.put("stuD", 60);
    System.out.println("studentMap = " + studentMap);

    // 특정 학생의 값을 조회
    Integer stuA = studentMap.get("stuA");
    System.out.println("stuA = " + stuA);

    System.out.println(" keySet 활용" );
    Set<String> keySet = studentMap.keySet();
    for (String key : keySet) {
      System.out.println("1. key = " + key);
      Integer stu = studentMap.get(key);
      System.out.println( "Key= "+ key+ ", stuNum = " + stu);
    }
    System.out.println(" values 활용 "  );
    Collection<Integer> values = studentMap.values();
    for (Integer value : values) {
      System.out.println( "1. value= " + value);
    }

    System.out.println(" 엔트리 셋 활용 " );
    Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }


}
