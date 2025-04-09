package Generic.ex3;

import Generic.ex1.IntegerBox;

public class BoxMain3 {

  public static void main(String[] args) {

    GenericBox<Integer> integerBox = new GenericBox<>();

    integerBox.SetValue(10);
    System.out.println("integerBox = " + integerBox.GetValue());

    GenericBox<String> strBox = new GenericBox<>();

    strBox.SetValue("문자열 10");
    System.out.println("strBox = " + strBox.GetValue());


  }

}
