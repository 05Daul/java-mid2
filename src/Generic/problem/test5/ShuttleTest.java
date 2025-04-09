package Generic.problem.test5;

import Generic.problem.test5.Unit.Marine;
import Generic.problem.test5.Unit.Zealot;
import Generic.problem.test5.Unit.Zergling;

public class ShuttleTest {

  public static void main(String[] args) {

    Shuttle<Marine> shuttle1 = new Shuttle<>();
    shuttle1.in(new Marine("마린",40));
    shuttle1.showInfo();

    Shuttle<Zealot> shuttle2 = new Shuttle<>();
    shuttle2.in(new Zealot("질럿",100));
    shuttle2.showInfo();

    Shuttle<Zergling> shuttle3 = new Shuttle<>();
    shuttle3.in(new Zergling("저글링",30));
    shuttle3.showInfo();

    UnitPrinter.printV1(shuttle1);
    UnitPrinter.printV2(shuttle1);

  }
}