package Generic.problem.test5;

import Generic.problem.test5.Unit.Marine;
import Generic.problem.test5.Unit.Zealot;

public class BioUtilTest {

  public static void main(String[] args) {
    Marine m1 = new Marine("마린1",40);
    Marine m2 = new Marine("스팀팩 마린2",30);

    Marine resultMarine =UnitUtil.maxHp(m1,m2);
    System.out.println("resultMarine = " + resultMarine.getName());
    Zealot z1 = new Zealot("질럿1",100);
    Zealot z2 = new Zealot("질럿2",100);
    Zealot resultZealot = UnitUtil.maxHp(z1,z2);
    System.out.println("resultZealot = " + resultZealot.getName());
  }
}
