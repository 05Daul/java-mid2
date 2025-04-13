package collection.myhashset.member;

import java.util.Objects;

public class MemberOnlyHash {
  String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MemberOnlyHash(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "MemberNoHashNoEq{" +
        "id='" + id + '\'' +
        '}';
  }

/// hashcode만 남기고, equals는 지움
  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
