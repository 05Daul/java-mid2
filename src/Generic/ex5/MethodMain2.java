package Generic.ex5;

import Generic.ex4.Cat;
import Generic.ex4.Dog;

public class MethodMain2 {

  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이",50);
    Cat cat = new Cat("냐옹이",40);

    AnimalMethod.checkUp(dog);
    AnimalMethod.checkUp(cat);

    Dog target =new Dog("큰 멍멍이",60);
    Dog bigger =AnimalMethod.Bigger(dog, target);
    System.out.println("bigger = " + bigger);
  }
}
