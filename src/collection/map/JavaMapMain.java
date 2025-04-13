package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaMapMain {

  public static void main(String[] args) {
    // 순서 보장 X
    run(new HashMap<>());
    // 순서 보장 O
    run(new LinkedHashMap<>());
    run(new TreeMap<>());

  }

  private static void run(Map<String, Integer> map) {
    System.out.println("map = " + map.getClass());
    map.put("b", 10);
    map.put("a", 1);
    map.put("d", 14);
    map.put("c", 3);
    map.put("e", 5);
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      System.out.print("  key = " + key + ", value = " + map.get(key));
    }
  }

}
