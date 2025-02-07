package org.test;

import java.util.HashMap;
import java.util.Map;

public class dupfinder {
	public static void main(String[] args) {
	      String[] array = {"apple", "banana", "orange", "apple", "banana", "grape", "apple" };
	        findDuplicates(array);
	    }

	    public static void findDuplicates(String[] array) {
	        Map<String, Integer> countMap = new HashMap<>();
	        
	        for (String item : array) {
	            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
	        }

	        System.out.println("Duplicate items:");
	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	            }
	        }
	    
	}

}
