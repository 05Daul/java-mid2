package collection.link.list;

import collection.link.Mylinked.MyLinkedListV1;

public class BatchProcessMain {

  public static void main(String[] args) {
//    MyLinkedList<Integer> list =new MyLinkedList();
    MyArrayList<Integer> list = new MyArrayList<>();

    BatchProcessor processor = new BatchProcessor(list);
    processor.logic(50000);

  }

}
