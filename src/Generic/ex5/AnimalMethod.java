package Generic.ex5;

import Generic.ex4.Animal;

public class AnimalMethod {
  public static<T extends Animal> void checkUp(T t) {
    System.out.println("동물의 이름 = " + t.getName());
    System.out.println("동물의 사이즈 = " + t.getSize());
    t.sound();
  }

  public static <T extends Animal> T Bigger(T t1,T t2) {
    // 삼황 연산자

    return t1.getSize() > t2.getSize() ? t1 : t2;

  }

}
