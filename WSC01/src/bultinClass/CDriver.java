package bultinClass;

public class CDriver {

	public static void main(String[] args) {
		Car c = new Car("Honda", "black", "civic", "x");
		Car c1 = new Car("Honda", "black", "civic", "x");
		 
		System.out.println(c == c1);//false
		
		
         System.out.println(c.equals(c1));
         
         System.out.println(c1.hashCode());
	}


}
