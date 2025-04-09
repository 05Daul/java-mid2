package Generic.problem.test3;

import Generic.ex4.Animal;
import Generic.ex4.Cat;
///  다형성을 이용한 중복제거
public class AnimalHospitalV1 {

  public Animal animal;

  public Animal getAnimal() {
    return animal;
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }



  public void checkUp(){
    System.out.println("동물의 이름 = " + animal.getName());
    System.out.println("동물의 사이즈 = " + animal.getSize());
    animal.sound();
  }

  public Animal Bigger(Animal target){
    // 삼황 연산자
    return animal.getSize() > target.getSize() ? animal : target;

  }
}
