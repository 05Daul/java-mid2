package collection.myhashset;

public class MyHashSetV0Main {

  public static void main(String[] args) {
      MyHashSetV0 set = new MyHashSetV0();
    set.add(1); /// O(1)
    set.add(2);/// O(n)
    set.add(3);/// O(n)
    set.add(4);/// O(n)
    set.add(5);/// O(n)
    System.out.println("set = " + set);

    set.add(4);/// O(n) + 중복 데이터 저장시
    System.out.println(" 중복 데이터를 저장 시 " );
    System.out.println("set = " + set);
    System.out.println("set.contains(3) = " + set.contains(3));
    System.out.println("set.contains(99) = " + set.contains(99));

  }

}
