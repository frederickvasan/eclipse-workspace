package org.test;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicates {
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> inputList) {
		  // Create a HashSet to store unique values
        HashSet<Integer> uniqueSet = new HashSet<>(inputList);
        
        // Convert the HashSet back to an ArrayList
        ArrayList<Integer> resultList = new ArrayList<>(uniqueSet);
        
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        
        System.out.println("Original list: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);

	}

}
