package bultinClass;

public class DriverPhone {

	public static void main(String[] args) {
		
		phoneNumber p1 = new phoneNumber(987654321);
		System.out.println(p1);//p1.toString()
		
		phoneNumber p2=p1;
		
		p2.mobileNum=12345;
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
