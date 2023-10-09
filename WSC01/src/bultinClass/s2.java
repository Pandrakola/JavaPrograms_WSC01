package bultinClass;



public class s2 {

	public static void main(String[] args) {
		String FirstName="Glory";
		String SecondName="Anitha";
		
		System.out.println("equal method  = " +FirstName.equals(SecondName));
		System.out.println("equals Ignorecase = " + FirstName.equalsIgnoreCase(SecondName));
		
	
		Object Surname="Pandrakola";
		System.out.println("toString method is :"+Surname.toString());
		
		System.out.println("toString method is : "+FirstName.toString());

	
		System.out.println("Hash code is: "+FirstName.hashCode());

	}

}
