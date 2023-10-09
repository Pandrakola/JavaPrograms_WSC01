package inheritance;

public class SoftwaereEngineer {
	int empId;
	String empName;
	double empSalary;
	
	public SoftwaereEngineer(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public void empDetails() {
		System.out.println("Employee id :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSalary);
		
	}

}
