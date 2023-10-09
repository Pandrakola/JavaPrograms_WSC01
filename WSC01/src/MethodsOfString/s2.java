package MethodsOfString;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		
		String name=sc.nextLine();
		
		String var = name.substring(name.length()-5);
		System.out.println(var);
		

	}

}
