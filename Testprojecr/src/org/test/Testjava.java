package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testjava {
	
	public static void main(String[] args) {
//		System.out.println("Hello Java");
		
		String s = "Frederick Noble Vasanthraj";
		System.out.println("Text shown: " +s);
		
		String r = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(i);
			r=c + r;
				
		}
		System.out.println("Reverse string: "+r);
		String afch = s.replaceAll("\\s","");
//		System.out.println(afch);
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < afch.length(); i++) {
			char ca = afch.charAt(i);
			if (mp.containsKey(ca)) {
				Integer Ct = mp.get(ca);
				mp.put(ca, Ct+1);
			}
				else {
					mp.put(ca, 1);
				}
		   }
		System.out.println(mp);
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();
    boolean isPalindrome = true;
    for (int i = 0; i < inputString.length() / 2; i++) {
        if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
            isPalindrome = false;
            break;
        }
    }
    if (isPalindrome) {
        System.out.println(inputString + " is a palindrome.");
    } else {
        System.out.println(inputString + " is not a palindrome.");
    }

}
}
