package org.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class removedupllinkedhas {
	 public static ArrayList<String> removeDuplicates(ArrayList<String> inputList) {
	        // Create a LinkedHashSet to store unique strings and preserve order
	        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(inputList);
	        
	        // Convert the LinkedHashSet back to an ArrayList
	        ArrayList<String> resultList = new ArrayList<>(uniqueSet);
	        
	        return resultList;
	    }
	 public static void main(String[] args) {
		 ArrayList<String> words = new ArrayList<>();
	        words.add("apple");
	        words.add("banana");
	        words.add("apple");
	        words.add("orange");
	        words.add("banana");
	        words.add("grape");
	        
	        System.out.println("Original list: " + words);
	        ArrayList<String> uniqueWords = removeDuplicates(words);
	        System.out.println("List after removing duplicates: " + uniqueWords);
	}

}
