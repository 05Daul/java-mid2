package collection.link.Node;

public class NodeMainV3 {

  public static void main(String[] args) {

    NodeV3 first = new NodeV3("A");
    first.next = new NodeV3("B");
    first.next.next = new NodeV3("C");
    first.next.next.next = new NodeV3("D");
    System.out.println("first = " + first);

    /// 모든 노드 탐색하기
    System.out.println(" 모든 노드 탐색하기 ");
    printAll(first);

    /// 마지막 노드 조회하기
    System.out.println(" 마지막 노드 탐색하기 ");
    getLastNode(first);

    ///  특정 index의 노드 탐색하기
    int index=2;
    NodeV3 index2Node = getNode(first,index);
    System.out.println("index2Node = " + index2Node);

    ///  데이터 추가하기
    System.out.println(" 데이터 추가하기 ");
    add(first,"D");
  }

  private static void add(NodeV3 first, String param) {
    NodeV3 node = getLastNode(first);
    node.next = new NodeV3(param);
  }

  private static NodeV3 getNode(NodeV3 first, int index) {
    NodeV3 node = first;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }
  private static NodeV3 getLastNode(NodeV3 node) {
    NodeV3 x = node;
    while (x.next != null) {
      x = x.next;
    }
    System.out.println(" 마지막 노드: " + x);
    return x;
  }

  private static void printAll(NodeV3 node) {
    NodeV3 x = node;
    while (x != null) {
      System.out.print(x);
      if (x.next != null) {
        System.out.print(" -> ");
      }
      x = x.next;
    }
    System.out.println(); // 줄바꿈
  }

}
