package collection.myhashset;

import collection.myhashset.member.Member;

public class MyHashSetV3Main {

  public static void main(String[] args) {
    MySet<String> set = new MyHashSetV3<>(15);
    set.add("A");
    set.add("B");
    set.add("C");
    set.add("D");
    set.add("E");
    set.add("F");
    set.add("AB");
    set.add("BE");
    set.add("SET");
    set.add("HASH");
    set.add("CODE");
    System.out.println("set = " + set);

    /// 검색
    String searchValue = "HASH";
    boolean contains = set.contains(searchValue);
    System.out.println("searchValye = "+searchValue+", contains = " + contains);
  }

}
