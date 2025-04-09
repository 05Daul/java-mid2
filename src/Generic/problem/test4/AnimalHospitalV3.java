package Generic.problem.test4;

import Generic.ex4.Animal;

///  다형성을 이용한 중복제거
public class AnimalHospitalV3<T extends Animal> {

  public T animal;

  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }

/// <T extends Animal> 제한으로
/// animal의 기능을 사용 할 수 다.
  public void checkUp() {
    System.out.println("동물의 이름 = " + animal.getName());
    System.out.println("동물의 사이즈 = " + animal.getSize());
    animal.sound();
  }

  public T Bigger(T target) {
    // 삼황 연산자
     return animal.getSize() > target.getSize() ? animal : target;
  }
}
