package Generic.problem.test3;

import Generic.ex4.Cat;
import Generic.ex4.Dog;
public class AnimalHospitalMainV1 {

  public static void main(String[] args) {

  AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
  AnimalHospitalV1 catHospital = new AnimalHospitalV1();

  Dog dog = new Dog("흑구", 50);
  Cat cat = new Cat("흑냥", 45);
  //개 병원
    dogHospital.setAnimal(dog);
    dogHospital.checkUp();

  //고양이 병원
    catHospital.setAnimal(cat);
    catHospital.checkUp();

  /// 문제점: 매개변수 확인을 실패.
  catHospital.setAnimal(dog);

  //  개 타입 뱐환
    Dog animal =(Dog) dogHospital.Bigger(new Dog("흑구3",70));
    dogHospital.checkUp();
}

}
