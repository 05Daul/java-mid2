package Generic.ex1;

import javax.management.StringValueExp;

public class BoxMain1 {
  
  public static void main(String[] args) {
    IntegerBox intBox = new IntegerBox();
    intBox.setValue(10);
    Integer integer = intBox.getValue();
    System.out.println("integer = " + integer);

    StringBox stringBox = new StringBox();
    stringBox.setString("hello");
    String string = stringBox.getString();
    System.out.println("string = " + string);
  }

}
