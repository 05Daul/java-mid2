package Generic.ex4;

public class Cat extends Animal {

  public Cat(String name, int size) {
    super(name, size);
  }

  @Override
  public void sound() {
    System.out.println("\"야옹\" = " + "야옹");
  }
}
