package Generic.ex5;

public class MethodMain1 {
  public static void main(String[] args) {
    Integer i=10;
    GenericMethod.objMethod(i);
    GenericMethod.GeneMethod(i);
    GenericMethod.BoundMethod(i);

    String j = "십";
    GenericMethod.objMethod(j);
    GenericMethod.GeneMethod(j);
    /// GenericMethod.BoundMethod(j);  오류 발생

    System.out.println(" 명시적 타입 인자 전달 " );
    GenericMethod.<Integer>GeneMethod(i);
  }

}
