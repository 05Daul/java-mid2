package Generic.problem.test2;

import Generic.ex4.Cat;
import Generic.ex4.Dog;

public class AnimalHospital {

  public static void main(String[] args) {

    DogHospital dogHospital = new DogHospital();
    CatHospital catHospital = new CatHospital();

    Dog dog = new Dog("흑구", 50);
    Cat cat = new Cat("흑냥", 45);


    //개 병원
    dogHospital.setAnimal(dog);
    dogHospital.checkUp();

    //고양이 병원
    catHospital.setAnimal(cat);
    catHospital.checkUp();

    ///  개 타입 뱐환
    dogHospital.setAnimal(new Dog("흑구2",60));
    dogHospital.checkUp();
  }
}