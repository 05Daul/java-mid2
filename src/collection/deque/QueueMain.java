package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

  public static void main(String[] args) {

    Queue<Integer> queue = new ArrayDeque<>();
//    Queue<Integer> queue= new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    System.out.println("queue = " + queue);

    /// 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만
    System.out.println("queue.peek = " + queue.peek());

    /// 데이터 꺼내기
    System.out.println("queue.p = " + queue.poll());
    System.out.println("queue.p = " + queue.poll());
    System.out.println("queue.p = " + queue.poll());

}
}
