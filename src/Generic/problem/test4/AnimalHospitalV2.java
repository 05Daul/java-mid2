package Generic.problem.test4;

import Generic.ex4.Animal;

///  다형성을 이용한 중복제거
public class AnimalHospitalV2<T> {

  public T animal;

  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }


  public void checkUp() {
    /// T의 타입을 메서드를 정의하는 시점을 알 수 없다. Object의 기능만 사용O
//    System.out.println("동물의 이름 = " + animal.getName());
//    System.out.println("동물의 사이즈 = " + animal.getSize());
//    animal.sound();
  }

  public T Bigger(T target) {
    // 삼황 연산자
    // return animal.getSize() > target.getSize() ? animal : target;
    return null;
  }
}
