package org.statements;

public class switchtest {
	
	public static void main(String[] args) {
		int  a = 1;
		switch (a) {
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Value not in range");
			break;
		}
		
	}

}
