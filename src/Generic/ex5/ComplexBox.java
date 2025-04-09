package Generic.ex5;

import Generic.ex4.Animal;

public class ComplexBox<T extends Animal> {

private T animal;

  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }
  public <Z> Z printAndReturn(Z z){
    System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
    System.out.println("z.getClass().getName() = " + z.getClass().getName());
    return z;
  }
}
