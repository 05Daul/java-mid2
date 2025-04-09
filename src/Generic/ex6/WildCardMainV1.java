package Generic.ex6;

import Generic.ex4.Cat;
import Generic.ex4.Dog;

public class WildCardMainV1 {

  public static void main(String[] args) {

    Box<Object> objectBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.setT(new Dog("두부",100));
    catBox.setT(new Cat("두냥",100));


    WildCardEx.<Dog>printGenericV1(dogBox);
    WildCardEx.printWildCardV1(dogBox);

    WildCardEx.<Dog>printGenericV2(dogBox);
    WildCardEx.printWildCardV2(dogBox);


    WildCardEx.<Dog>printGenericV3(dogBox);
    WildCardEx.printWildCardV3(dogBox);

//    WildCardEx.<Cat>printGenericV1(catBox);
//    WildCardEx.<Cat>printGenericV2(catBox);
//    WildCardEx.<Cat>printGenericV3(catBox);

  }

}
