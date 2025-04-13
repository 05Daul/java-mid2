package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

  public static void main(String[] args) {

    Deque<Integer> deque = new ArrayDeque<>();

    /// stack 로 사용
    deque.push(1);
    deque.push(2);
    deque.push(3);
    System.out.println("deque = " + deque);
    ///  단순 조회
    System.out.println("deque.peek() = " + deque.peek());

    /// 데이터 꺼내기
    System.out.println("deque.pop = " + deque.pop());

  }
}
