package collection.test.maptest;

import java.util.HashMap;

public class CommonKeyValueSum1 {

  public static void main(String[] args) {

    HashMap<String, Integer> map1 = new HashMap<>();
    map1.put("a", 1);
    map1.put("b", 2);
    map1.put("c", 3);

    HashMap<String, Integer> map2 = new HashMap<>();
    map2.put("b", 4);
    map2.put("c", 5);
    map2.put("d", 6);
    
    HashMap<String, Integer> map3 = new HashMap<>();
    for (String key : map1.keySet()) {
      if(map2.containsKey(key)){
        int sum = map1.get(key) + map2.get(key);
        map3.put(key, sum);
      }
    }
    System.out.println("map3 = " + map3);
  }
}
