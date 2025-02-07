
package Listtest;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class listtest1 {
	
	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(10);
		li1.add(50);
		li1.add(60);
		li1.add(20);
		System.out.println(li1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		List<Object> li2 = new ArrayList<>();
		
		li2.add(10);
		li2.add("Frederick");
		li2.add(98987689);
		li2.add(true);
		li2.add(101);
		li2.add(887687.987f);
		System.out.println(li2);	
		
		Object object = li2.get(2);
		System.out.println(object);
	}

}
