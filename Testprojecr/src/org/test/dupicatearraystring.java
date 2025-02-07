package org.test;

import java.util.Arrays;

public class dupicatearraystring {
  public static void main(String[] args) {
	   String[] originalArray = {"apple", "banana", "cherry"};
       String[] duplicatedArray = duplicateArray(originalArray);
       
       System.out.println(Arrays.toString(duplicatedArray));
   }

   public static String[] duplicateArray(String[] array) {
       String[] newArray = new String[array.length * 2];
       for (int i = 0; i < array.length; i++) {
           newArray[i] = array[i];
           newArray[i + array.length] = array[i];
       }
       return newArray;
}
}
