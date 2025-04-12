package collection.myhashset.member;

public class MemberNoHashNoEq {
  String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MemberNoHashNoEq(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "MemberNoHashNoEq{" +
        "id='" + id + '\'' +
        '}';
  }
}
