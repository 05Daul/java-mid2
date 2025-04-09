package Generic.problem.test2;

import Generic.ex4.Dog;

public class DogHospital {
  public Dog animal;


  public Dog getAnimal() {
    return animal;
  }

  public void setAnimal(Dog animal) {
    this.animal = animal;
  }

  public void checkUp(){
    System.out.println("동물의 이름 = " + animal.getName());
    System.out.println("동물의 사이즈 = " + animal.getSize());
    animal.sound();
  }

  public Dog Bigger(Dog target){
    // 삼황 연산자
    return animal.getSize() > target.getSize() ? animal : target;

  }
}
