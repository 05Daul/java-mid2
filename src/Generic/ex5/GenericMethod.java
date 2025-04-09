package Generic.ex5;

public class GenericMethod {

  public static Object objMethod(Object obj) {
    System.out.println("obj print= " + obj);
    return obj;
  }

  public static<T> T GeneMethod(T obj) {
    System.out.println(" T print= " + obj);
    return obj;
  }
  public static<T extends Number> T BoundMethod(T obj) {
    System.out.println("bound T print= " + obj);
    return obj;
  }

}
