package org.statements;

public class condition1 {

	public static void main(String[] args) {
		
	
	int a =10, b = 20, c=130;
	if(a>b || a<c) {
		System.out.println("A is lesser");
	} else if (b<a && b<c) {
		System.out.println("B is greater than A and less than C");
	}
	else if (b>c && a<c) {
		System.out.println("B is less than C and less than C");
	}
	else { System.out.println("C is greater");
}
}
}