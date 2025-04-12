package collection.myhashset;

import collection.myhashset.member.Member;

public class MyHashSetV2Main2 {

  public static void main(String[] args) {
    MyHashSetV2 set = new MyHashSetV2(15);
    Member hi = new Member("10");
    Member member = new Member("member"); //소문자
    Member java = new Member("MEMBER"); // 대문자
    Member spring = new Member("spring");
    System.out.println("hi.hashCode() = " + hi.hashCode());
    System.out.println("member.hashCode = " + member.hashCode());
    System.out.println("java.hashCode() = " + java.hashCode());
    System.out.println("spring.hashCode() = " + spring.hashCode());
    set.add(hi);
    set.add(member);
    set.add(java);
    set.add(spring);
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
    Member searchValue = new Member("10");
    boolean contains = set.contains(searchValue);
    System.out.println("searchValye = "+searchValue+", contains = " + contains);
  }

}
