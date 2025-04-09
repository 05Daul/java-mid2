package Generic.problem.test5;

import Generic.problem.test5.Unit.BioUnit;

public class Shuttle<T extends BioUnit> {

private T unit;

public void in(T t) {
  unit =t;
}

public T out() {
  return unit;
}

public void  showInfo(){
  System.out.println("unit = " + unit.getName()+ unit.getHp());
}
}
