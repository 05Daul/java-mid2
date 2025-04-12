package collection.myhashset.member;

import collection.myhashset.MyHashSetV2;

public class HashAndEqualMainV2 {

  public static void main(String[] args) {

    MyHashSetV2 set = new MyHashSetV2();
    MemberOnlyHash m1 = new MemberOnlyHash("A");
    MemberOnlyHash m2 = new MemberOnlyHash("A");
    System.out.println("m1 해시코드 = " + m1.hashCode());
    System.out.println("m2 해시코드 = " + m2.hashCode());
    /// hashCode()는 객체가 같은 해시 버킷에 들어갈 수 있도록 한다
    /// 그러나 hashCode()가 같다고 해서 논리적으로 같은 객체는 아니다.
    /// 실제로 같은 객체(논리적 동등성)로 판단하려면 equals()도 true를 반환하여야
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
