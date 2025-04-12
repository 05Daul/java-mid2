package collection.myhashset;

public class MyHashSetV1Main {

  public static void main(String[] args) {
    MyHashSetV1 set = new MyHashSetV1();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(6);
    set.add(7);
    set.add(99);
    set.add(9);
    set.add(17);
    set.add(37);
    System.out.println("set = " + set);

    /// 검색
    int searchValue =9;
    boolean contains = set.contains(searchValue);
    System.out.println("set.contains = (" +searchValue+" ) = "+ contains);

    /// 삭제
    boolean remove = set.remove(searchValue);
    System.out.println("set.remove = " + remove);
    System.out.println("set = " + set);
  }

}
