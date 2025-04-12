package collection.myhashset;

import java.util.Arrays;

public class StringHashMain {

  static final int CAPACITY = 10;

  public static void main(String[] args) {

    char CharA = 'A';
    char CharB = 'B';
    char CharC = 'C';
    hashCode("A");
    hashCode("B");
    hashCode("AB");

    System.out.println("CharA = " + hashCode("A"));
    System.out.println("CharB = " + hashCode("B"));
    System.out.println("CharAB = " + hashCode("AB"));

    /// hashindex
    System.out.println("CharAB의 hsahindex= " + hashIndex(hashCode("AB")));

  }

  static int hashCode(String str) {
    char[] chars = str.toCharArray();
    int sum = 0;
    for (int i = 0; i < chars.length; i++) {
      sum += chars[i];
    }
    return sum;
  }
  static int hashIndex(int hash) {
    return hash % CAPACITY;
  }

}
