package collection.link.list;

public class BatchProcessor {

  private final Mylist<Integer> list;

  public BatchProcessor(Mylist<Integer> list) {
    this.list = list;
  }

  public void logic(int size) {
    long startTime=System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    long endTime=System.currentTimeMillis();
    long elapsedTime=endTime-startTime;
    System.out.println("크기 = " +size+", 걸린시간 = "+ elapsedTime +"ms");
  }


}
