package collection.Array;

public class MyArrayListMainV4 {

  public static void main(String[] args) {
    MyArrayListV4<String> list = new MyArrayListV4<>();
    list.add("A");
    list.add("B");
    list.add("C");
//    list.add(1); 불가
    System.out.println("list = " + list);
    MyArrayListV4<Integer> list2 = new MyArrayListV4<>();
    list2.add(1);
    list2.add(2);
    System.out.println("list2 = " + list2);
  }
}
