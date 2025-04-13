package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

  public static void main(String[] args) {

    Deque<Integer> deque = new ArrayDeque<>();

    /// Queue 로 사용
    deque.offer(1);
    deque.offer(2);
    deque.offer(3);
    
    System.out.println("deque = " + deque);
    ///  단순 조회
    System.out.println("deque.peek() = " + deque.peek());

    /// 데이터 꺼내기
    System.out.println("deque.poll() = " + deque.poll());

  }
}
