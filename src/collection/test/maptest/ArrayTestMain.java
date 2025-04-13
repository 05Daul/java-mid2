package collection.test.maptest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayTestMain {

  public static void main(String[] args) {

    String[][] productArray = {{"Java","10000"},{"Python","20000"},{"C++","30000"}};
    System.out.println("productArray = " + Arrays.deepToString(productArray));
    
    Map<String, Integer> map = new HashMap<>();
    for(String[] product : productArray) {
      map.put(product[0], Integer.parseInt(product[1]));
    }
    for(String product : map.keySet()) {
      System.out.println("제품 : "+ map.keySet()+ ", 가격 : "+map.get(product));
    }
  }

}
