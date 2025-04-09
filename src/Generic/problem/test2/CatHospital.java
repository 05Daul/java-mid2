package Generic.problem.test2;

import Generic.ex4.Cat;

public class CatHospital {
  private Cat animal;


  public Cat getAnimal() {
    return animal;
  }

  public void setAnimal(Cat animal) {
    this.animal = animal;
  }

  public void checkUp(){
    System.out.println("동물의 이름 = " + animal.getName());
    System.out.println("동물의 사이즈 = " + animal.getSize());
    animal.sound();
  }

  public Cat Bigger(Cat target){
    // 삼황 연산자
    return animal.getSize() > target.getSize() ? animal : target;

  }
}
