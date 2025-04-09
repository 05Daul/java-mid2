package Generic.problem.test5;

import Generic.problem.test5.Unit.BioUnit;
import Generic.problem.test5.Unit.Marine;

public class UnitUtil {

  public static <T extends BioUnit> T maxHp(T t1,T t2) {
    return  t1.getHp() > t2.getHp() ? t1 : t2;
  }

}
