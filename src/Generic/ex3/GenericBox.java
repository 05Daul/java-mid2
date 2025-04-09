package Generic.ex3;

public class GenericBox<T> {

  ///  제네릭 타입을 사용할땐 미리 결정하지 않는다. -> 나중에 생성될 때 바뀐다.

  private T value;

  public void SetValue(T value) {
    this.value = value;
  }

  public T GetValue() {
    return value;
  }
}
