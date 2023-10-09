package ExtendsKeyword;

public class EmpDriver {

	public static void main(String[] args) {
		Developer dev=new Developer();
		
		dev.empId=100;
		dev.empName="Anitha";
		System.out.println(dev.empId);
		System.out.println(dev.empName);
		dev.login();
		dev.developApplication();
		Tester test=new Tester();
		test.testApplication();
		dev.logout();
		
		

	}

}
