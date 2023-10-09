package inheritance;

public class Demo {

	public static void main(String[] args) {
		SoftwaereEngineer ref;//variable of softwaereEngineer,address of object ref
		ref = new SoftwaereEngineer(230,"Ramesh",9876);//constrSoftwaereEnginee data insurting
		//System.out.println(ref.empId);//members of object
		//System.out.println(ref.empName);
		//System.out.println(ref.empSalary);
		ref.empDetails();
		

	}

}
