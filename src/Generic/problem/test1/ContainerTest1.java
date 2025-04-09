package Generic.problem.test1;


public class ContainerTest1 {

  public static void main(String[] args) {
    /// 예시 보고 생각해보기
    // 1) Container<?>를 통해 타입을 사용하니까 Container<>로 제네릭을 설정
    // 2) Container 메서드로 빈값을 확인하니까 초기화가 필요한걸까? => 확인용이였다

    Container<String> stringContainer = new Container();
    System.out.println("stringContainer.isEmpty() = " + stringContainer.isEmpty());
    stringContainer.setItem("Data1");
    System.out.println("stringContainer.getItem() = " + stringContainer.getItem());
    System.out.println("stringContainer.isEmpty() = " + stringContainer.isEmpty());

    Container<Integer> integerContainer = new Container();
    System.out.println("stringContainer.isEmpty() = " + integerContainer.isEmpty());
    integerContainer.setItem(1);
    System.out.println("integerContainer.getItem() = " + integerContainer.getItem());
    System.out.println("integerContainer.isEmpty() = " + integerContainer.isEmpty());


  }
}