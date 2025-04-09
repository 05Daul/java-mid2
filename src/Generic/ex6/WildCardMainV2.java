package Generic.ex6;

import Generic.ex4.Animal;
import Generic.ex4.Cat;
import Generic.ex4.Dog;

public class WildCardMainV2 {

  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<Animal> animalBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    /// Animal 포함 상위 타입 전달 가능
    writeBox(objBox);
    writeBox(animalBox);
  }

  // Animal이 하한. 즉 최소를 정하기
  static void writeBox(Box<? super  Animal> box) {
    box.setT(new Dog("멍멍이",100));
  }
}
