package collection.stack;

import java.util.Stack;

public class StackMain {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println("stack = " + stack);
    ///  꺼낼 요소 확인 
    System.out.println("stack.peak = " + stack.peek());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack = " + stack);

  }
}
