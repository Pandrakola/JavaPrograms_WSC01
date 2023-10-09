package Arrays;

import java.util.Scanner;

public class StoreCharacterOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter String");
		String s1=s.next();
		char[] a=new char[s1.length()];
		
		for(int i=0;i<=a.length-1;i++) {
			a[i]=s1.charAt(i);
			
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
