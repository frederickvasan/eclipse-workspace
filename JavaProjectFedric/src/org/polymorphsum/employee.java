package org.polymorphsum;
public class employee {
	private void employeed() {
		// TODO Auto-generated method stub
		System.out.println("Employee Details : ");
	}
	private void empl(int empID) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID : " +empID);
	}
	private void Empname(String Empname) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name : " +Empname);
	}
	private void emp(String Empname, float empsalary, long empmobile) {
				// TODO Auto-generated method stub
		System.out.println("Employee Name : " +Empname);
		System.out.println("Employee salary : " +empsalary);
		System.out.println("Employee Mobile : " +empmobile);
	}
	private void emp1(float empsalary,String Empname, long empmobile) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name : " +Empname);
		System.out.println("Employee salary : " +empsalary);
		System.out.println("Employee Mobile : " +empmobile);
	}
	public static void main(String[] args) {
		employee a = new employee();
				a.employeed();
				a.empl(3054);
				a.Empname("Frederick Noble");
				a.emp("Frederick Noble", 232321.219f, 3212112341l);
				a.emp1(3827192.4345f, "Frederick Noble", 3212112341l);
	}
	
}
