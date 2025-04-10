package collection.link.Node;

public class NodeV2 {

  Object item;
  NodeV2 next;


  public NodeV2(Object item) {
    this.item = item;
  }

  @Override
  public String toString() {
//    IDE 생성 toString
//    return "NodeV2{" +
//        "item=" + item +
//        ", next=" + next +
//        '}';
    /// A->B->C 이렇게
    StringBuilder sb = new StringBuilder();
    NodeV2 node = this;
    sb.append("[");
    while (node != null) {
      sb.append(node.item);
      if (node.next != null) {
        ///  마지막에도 '->' 찍는 걸 방지하기
        sb.append("->");
      }
      node = node.next;
    }
    sb.append("]");
    return sb.toString();
  }
}
