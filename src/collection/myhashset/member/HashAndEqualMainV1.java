package collection.myhashset.member;

import collection.myhashset.MyHashSetV2;

public class HashAndEqualMainV1 {

  public static void main(String[] args) {

    MyHashSetV2 set = new MyHashSetV2();
    MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
    MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
    System.out.println("m1 해시코드 = " + m1.hashCode());
    System.out.println("m2 해시코드 = " + m2.hashCode());
    System.out.println("m2.equals(m1) = " + m2.equals(m1));

    set.add(m1);
    set.add(m2);
    System.out.println(set);
    
    /// 검색 실패
    MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
    System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
    boolean result = set.contains(searchValue);
    System.out.println("result = " + result);
  }

}
