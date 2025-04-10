package collection.link.Node;

public class NodeMainV1 {

  public static void main(String[] args) {
    /// 1.  노드 생성하고 연결하기 (A-> B ->C ->D)

    NodeV1 first = new NodeV1("A");
    first.next = new NodeV1("B");
    first.next.next = new NodeV1("C");
    first.next.next.next = new NodeV1("D");
    System.out.println(" 모든 노드 탐색하기 " );
    System.out.println("first.item = " + first.item);
    System.out.println("first.next.item = " + first.next.item);
    System.out.println("first.next.next.item = " + first.next.next.item);
    System.out.println("first.next.next.next.item = " + first.next.next.next.item);

    NodeV1 x =first;
    while (x != null) {
      System.out.println(x.item);
      x = x.next;
    }

  }


}
