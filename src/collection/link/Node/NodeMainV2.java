package collection.link.Node;

public class NodeMainV2 {

  public static void main(String[] args) {
    /// 2. toString 활용한 node

    NodeV2 first = new NodeV2("A");
    first.next = new NodeV2("B");
    first.next.next = new NodeV2("C");
    first.next.next.next = new NodeV2("D");
    System.out.println(" 연결된 노드 출력하기 " );
    System.out.println("first = " + first);
  }

}
