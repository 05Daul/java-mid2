package Generic.problem.test5;

import Generic.problem.test5.Unit.BioUnit;

public class UnitPrinter {

  public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
    T unit = t1.out();
    System.out.println("unit 이름 : " + unit.getName() + "unit 체력 : " + unit.getHp());
  }

  public static void printV2(Shuttle<? extends BioUnit> t1) {
    BioUnit unit = t1.out();
    System.out.println("unit 이름 : " + unit.getName() + "unit 체력 : " + unit.getHp());
  }


}
