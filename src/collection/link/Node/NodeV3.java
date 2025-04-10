package collection.link.Node;

public class NodeV3 {

  public Object item;
  public NodeV3 next;


  public NodeV3(Object item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "[" + item + "]";
  }

  public static void add(NodeV3 first, String param) {
    NodeV3 node = getLastNode(first);
    node.next = new NodeV3(param);
  }

  public static NodeV3 getNode(NodeV3 first, int index) {
    NodeV3 node = first;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }
  public static NodeV3 getLastNode(NodeV3 node) {
    NodeV3 x = node;
    while (x.next != null) {
      x = x.next;
    }
    System.out.println(" 마지막 노드: " + x);
    return x;
  }

  public static void printAll(NodeV3 node) {
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
