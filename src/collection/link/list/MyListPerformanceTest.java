package collection.link.list;

public class MyListPerformanceTest {

  public static void main(String[] args) {

    int size = 50000;
    System.out.println(" mylist추가 ");
    addFirst(new MyArrayList<>(), size);
    addMid(new MyArrayList<>(), size);
    MyArrayList<Integer> arrayList = new MyArrayList<>(size); //조회용 데이터롤 사용
    addlast(arrayList, size);
    System.out.println("arrayList 를 조회= ");

    int loop = 10000;
    getindex(arrayList, loop, 0);
    getindex(arrayList, loop, size / 2);
    getindex(arrayList, loop, size - 1);
    System.out.println("arrayList 를 검색= ");

    getserach(arrayList, loop, 0);
    getserach(arrayList, loop, size / 2);
    getserach(arrayList, loop, size - 1);

    System.out.println(" mylinkedlist추가 ");
    addFirst(new MyLinkedList<>(), size);
    addMid(new MyLinkedList<>(), size);
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();
    System.out.println("linkedList 를 조회= ");
    addlast(linkedList, size);

    getindex(linkedList, loop, 0);
    getindex(linkedList, loop, size / 2);
    getindex(linkedList, loop, size - 1);
    System.out.println("linkedList 를 검색= ");
    getserach(linkedList, loop, 0);
    getserach(linkedList, loop, size / 2);
    getserach(linkedList, loop, size - 1);
  }

  public static void getindex(Mylist<Integer> list, int loop, int index) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.get(index);
    }
    long end = System.currentTimeMillis();
    System.out.println(" index: " + index + ", 반복: " + loop +
        ", 걸린시간 " + (end - start) + "ms");
  }

  public static void getserach(Mylist<Integer> list, int loop, int findvalue) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.indexOf(findvalue);
    }
    long end = System.currentTimeMillis();
    System.out.println(" findvalue: " + findvalue + ", 반복: " + loop +
        ", 걸린시간 " + (end - start) + "ms");
  }

  public static void addFirst(Mylist<Integer> mylist, int size) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      mylist.add(0, i);
    }
    long end = System.currentTimeMillis();
    System.out.println(" 앞에 추가 -크기 " + size + " , 계산시간 " + (end - start) + " ms");
  }

  public static void addMid(Mylist<Integer> mylist, int size) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      mylist.add(i / 2, i);
    }
    long end = System.currentTimeMillis();
    System.out.println(" 앞에 추가 -크기 " + size + " , 계산시간 " + (end - start) + " ms");
  }

  public static void addlast(Mylist<Integer> mylist, int size) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      mylist.add(i);
    }
    long end = System.currentTimeMillis();
    System.out.println(" 마지막 추가 -크기 " + size + " , 계산시간 " + (end - start) + " ms");
  }
}
