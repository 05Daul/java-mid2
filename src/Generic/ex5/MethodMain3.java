package Generic.ex5;

import Generic.ex4.Cat;
import Generic.ex4.Dog;

public class MethodMain3 {

  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이",80);
    Cat cat = new Cat("냐옹이",70);


    ComplexBox<Dog> hospital = new ComplexBox<>();
    hospital.setAnimal(dog);

    Cat retunCat = hospital.printAndReturn(cat);
    System.out.println("retunCat = " + retunCat);
  }
}
