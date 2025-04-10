package collection.Array;

public class MyArrayListMainV3 {

  public static void main(String[] args) {
    MyArrayListV3 list = new MyArrayListV3();
    list.add("1");
    list.add("2");
    list.add("3");
    System.out.println("list = " + list);

    System.out.println(" 마지막에 추가하기: addlist");
    list.add(3, "add list");
    System.out.println("list = " + list);
    list.add(1, "add list");
    System.out.println("list = " + list);
    list.remove(1);
    System.out.println("list = " + list);
  }
}
