package week5_A2_INHERITANCE_ACTIVITY;

public class Employee {
	
//	INITIALIZE THE VARIABLES
		private long employeeId;
		private String employeeName;
		private String employeeAddress;
		private long employeePhone;
		private double basicSalary;      /*PROTECTED TO ALLOW CHILD CLASSES TO BE MODIFY*/
		private double specialAllowance = 250.80;     
		private double hra = 1000.50;                 	
		
//	OVERLOADED CONSTRUCTOR FOR EMPLOYEE
		public Employee(long Id, String Name, String Address, long Phone) {
			this.employeeId = Id;
			this.employeeName = Name;
			this.employeeAddress = Address;
			this.employeePhone = Phone;
		}

//	METHOD TO CALCULATE SALARY
		public void calculateSalary() {
			double newSalary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
			System.out.println(newSalary);
		}
		
//		
//	    public double calculateSalary() {
//	        double newSalary = this.basicSalary + ( this.basicSalary * this.specialAllowance/100) + (this.basicSalary * this.hra/100);
//	            return newSalary;
//	    }
//	
	
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
}
