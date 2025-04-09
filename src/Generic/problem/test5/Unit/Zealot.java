package Generic.problem.test5.Unit;

public class Zealot extends BioUnit {

  private String name;
  private int hp;

  public Zealot(String name, int hp) {
    super(name,hp);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
