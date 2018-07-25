package week5_A2_INHERITANCE_ACTIVITY;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary; 
	private double specialAllowance;        /*default value- 250.80*/
	private double hra;                 	/*default value- 1000.50*/
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.hra = hra;
	}
	

	public static void calculateSalary(double basicSalary, double specialAllowance, double hra) {
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println(salary);
	}
	
	
	
}
