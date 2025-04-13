package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    //Deque<Integer> deque = new LinkedList<>();
    deque.offerFirst(1);
    System.out.println("deque = " + deque);
    deque.offerFirst(2);
    System.out.println("deque = " + deque);
    deque.offerFirst(3);
    System.out.println("deque = " + deque);
    deque.offerFirst(4);
    System.out.println("deque = " + deque);
    deque.offerFirst(5);
    System.out.println("deque = " + deque);
    
    /// 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
    System.out.println("deque.peekFirst() = " + deque.peekFirst());
    System.out.println("deque.peekLast() = " + deque.peekLast());


  }

}
