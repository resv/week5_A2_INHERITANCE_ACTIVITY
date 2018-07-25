package week5_A2_INHERITANCE_ACTIVITY;

public class Manager extends Employee{

	public Manager(long Id, String Name, String Address, long Phone, double Salary) {
		super(Id, Name, Address, Phone);
		super.basicSalary = Salary;
	}
}


	
	
	
	

