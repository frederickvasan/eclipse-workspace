package org.inheritance;

public class inhetrtiance1 extends comp {

	  private void empName() {
		// TODO Auto-generated method stub
		  
		  System.out.println("Emplyee Name : Frederick Noble");
		  	}
	  
	  private void empid() {
		// TODO Auto-generated method stub
            System.out.println("Emplyee ID: 3054");
	}
	  
	  public static void main(String[] args) {
		  
		  inhetrtiance1 a = new inhetrtiance1();
		  a.empName();
		  a.empid();
		  a.comID();
		  a.compName();
		  a.client();
		  a.clientID();
		  a.handler();
	}
}
