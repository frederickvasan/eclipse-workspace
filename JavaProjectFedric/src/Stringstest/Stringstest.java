package Stringstest;

public class Stringstest {
	
	public static void main(String[] args) {
	String a = "Java Language";
	    int length    = a.length();
	    System.out.println(length);
   
	    String upperCase = a.toUpperCase();
	    System.out.println(upperCase);
   
	    String lowerCase = a.toLowerCase();
	    System.out.println(lowerCase);
   
	    char charAt = a.charAt(3);
	    System.out.println(charAt);
	    
	    int indexOf = a.indexOf("L");
	    System.out.println(indexOf);
	    
	    int lastIndexOf = a.lastIndexOf("a");
	    System.out.println(lastIndexOf);
	    
	    boolean equals = a.equals("Java");
	    System.out.println(equals);
	    
	    boolean equalsIgnoreCase = a.equalsIgnoreCase("Java");
	    System.out.println(equalsIgnoreCase);
}
}
