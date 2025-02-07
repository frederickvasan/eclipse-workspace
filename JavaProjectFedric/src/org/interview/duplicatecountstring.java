package org.interview;

import java.util.HashMap;
import java.util.Map;


public class duplicatecountstring {
	public static void main(String[] args) {
		

	
	String s = "asdasewfsdfsewe safsfsd";
//	String [] str = s.split(" ");
    Map<Character, Integer> mp =new HashMap<Character, Integer >();
    
    for (int i = 0; i < s.length(); i++) {
    	char ca = s.charAt(i);
    	if (mp.containsKey(ca)) {
			Integer count = mp.get(ca);
			mp.put(ca, count+1);
//			System.out.println(mp);
    	}
			else {
				mp.put(ca, 1 );
			}
		}
    	System.out.println(mp);
    }
    
    

}

