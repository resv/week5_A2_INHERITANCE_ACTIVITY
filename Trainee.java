package week5_A2_INHERITANCE_ACTIVITY;

public class Trainee extends Employee{

	public Trainee(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		super.basicSalary = salary;
	}
}
