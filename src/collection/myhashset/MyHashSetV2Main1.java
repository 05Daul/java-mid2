package collection.myhashset;

public class MyHashSetV2Main1 {

  public static void main(String[] args) {
    MyHashSetV2 set = new MyHashSetV2();
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
    String searchValue = "SET";
    boolean contains = set.contains(searchValue);
    System.out.println("set.contains = (" +searchValue+" ) = "+ contains);

    /// 삭제
    boolean remove = set.remove(searchValue);
    System.out.println("set.remove = " + remove);
    System.out.println("set = " + set);
  }

}
