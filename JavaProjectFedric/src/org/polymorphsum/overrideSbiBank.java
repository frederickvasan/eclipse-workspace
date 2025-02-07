package org.polymorphsum;

public class overrideSbiBank extends overriderbibank {
	
	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
		System.out.println("SBI Fixed = 7%");
		super.fixed();
	}
	
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBI Loan = 10%");
		super.loan();
	}
	
	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("SBI deposite = 10%");
		super.deposite();
	}

	public static void main(String[] args) {
		overrideSbiBank a = new overrideSbiBank();
				a.deposite();
				a.loan();
				a.deposite();
	}
	
}
