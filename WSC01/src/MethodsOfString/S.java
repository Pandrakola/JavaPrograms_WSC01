package MethodsOfString;

public class S {

	public static void main(String[] args) {
		String a="Hi Welcome";
		a=a.toLowerCase();
		System.out.println(a);
		a=a.toUpperCase();
		System.out.println(a);
		
		a=a.translateEscapes();
		System.out.println(a);

	}

}
