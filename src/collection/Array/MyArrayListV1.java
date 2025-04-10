package collection.Array;

import java.util.Arrays;

public class MyArrayListV1 {
/// 고정 배열
  private static final int DEAFULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV1() {
    /// 기본 배열의 크기를 DEAFULT_CAPACITY 인 5로 지정
    elementData = new Object[DEAFULT_CAPACITY];
  }

  public MyArrayListV1(int initialCapacity) {
    /// 지정 배열의 크기: 입력값
    elementData = new Object[initialCapacity];
  }
  public int size() {
    return size;
  }

  public void add(Object e){
    elementData[size] = e;
    size++;
  }

  public Object get(int index){
    return elementData[index];
  }

  public Object set(int indexm ,Object element){
    Object old = elementData[indexm];
    elementData[indexm] = element;
    // 값을 교체하지만, 이전의 값은 리턴.
    return old;
  }
  public int indexOf(Object o){
    for(int i = 0; i < size; i++){
      if(elementData[i].equals(o)){
        return i;
      }
    }
    return -1;
  }

  public String toString(){
    return  Arrays.toString(Arrays.copyOf(elementData, size))+" size :" +size
        + "capacity :"+elementData.length;
  }
}
