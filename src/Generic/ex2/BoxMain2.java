package Generic.ex2;

import Generic.ex1.IntegerBox;

public class BoxMain2 {
  public static void main(String[] args) {
    ObjectBox intgerBoxtest = new ObjectBox();
    intgerBoxtest.SetObject(10);
    Integer integer = (Integer) intgerBoxtest.GetObject();
    System.out.println("integerBox2 : " + integer);

    ObjectBox StringBoxtest = new ObjectBox();
    StringBoxtest.SetObject("hello");
    String string = (String) StringBoxtest.GetObject();
    System.out.println("stringBox2 : " + string);

    /// 잘못된 타입을 전달하기 => 예외 발생
    intgerBoxtest.SetObject("숫자열");
    Integer string2 = (Integer) intgerBoxtest.GetObject();
    System.out.println("stringBox2 : " + string2);
  }

}
