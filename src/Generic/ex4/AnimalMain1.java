package Generic.ex4;

public class AnimalMain1 {

  public static void main(String[] args) {

    Animal animal = new Animal("동물",100);
    Dog dog = new Dog("백구",50);
    Cat cat = new Cat("흑냥",45);

    AnimalBox<Animal> animalBox = new AnimalBox<>();
    AnimalBox<Dog> dogBox = new AnimalBox<>();
    AnimalBox<Cat> catBox = new AnimalBox<>();

    ///  1. 다형성
    animalBox.setAnimal(dog);
    animalBox.setAnimal(cat);

    /// 2. 제네릭
    // 1) dog
    dogBox.setAnimal(dog);
    /// dogBox.setAnimal(cat);불가

    // 1) cat
    /// catBox.setAnimal(dog); 불가
    catBox.setAnimal(cat);

  }

}
