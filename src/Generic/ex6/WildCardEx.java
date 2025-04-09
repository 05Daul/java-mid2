package Generic.ex6;

import Generic.ex4.Animal;

public class WildCardEx {

  static <T> void printGenericV1(Box<T> box) {
    System.out.println(" T = " + box.getT());
  }

  ///  Box<?> 에 T, Cat, Dog 등 전부 들어올 수 있다.
  static void  printWildCardV1(Box<?> box) {
    System.out.println(" ? = " + box.getT());
  }

  static <T extends Animal> void printGenericV2(Box<T> box) {
    T t = box.getT();
    System.out.println(" 이름 = " + t.getClass().getName());
  }

  static  void printWildCardV2(Box<? extends Animal> box ) {
    Animal t = box.getT();
    System.out.println(" 이름 = " + t.getClass().getName());
  }

  static <T extends Animal> T printGenericV3(Box<T> box) {
    T t = box.getT();
    System.out.println(" 이름 = " + t.getClass().getName());
    return t;
  }
  static Animal printWildCardV3(Box<? extends Animal > box) {
    Animal t = box.getT();
    System.out.println(" 이름 = " + t.getClass().getName());
    return t;
  }

}
