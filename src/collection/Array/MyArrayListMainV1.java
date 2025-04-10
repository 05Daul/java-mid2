package collection.Array;

public class MyArrayListMainV1 {

  public static void main(String[] args) {
    MyArrayListV1 list = new MyArrayListV1();
    System.out.println(" 데이터 추가 ");
    System.out.println(list);
    list.add("A");
    System.out.println(list);
    list.add("B");
    System.out.println(list);
    list.add("C");
    System.out.println(list);
    list.add("D");
    System.out.println(list);
    list.add("E");
    System.out.println(list);

    System.out.println(" 기능을 사용하기 " );
    System.out.println("list사이즈: "+list.size());
    System.out.println("list.조회: "+list.get(1));
    System.out.println("list.찾기: "+list.indexOf("B"));
    System.out.println("list.set(2,\"Z\") = " + list.set(2,"Z"));
    System.out.println(list);
    /// ArrayIndexOutOfBoundsException: list.add("F"); V2 에서 가능

  }
}
