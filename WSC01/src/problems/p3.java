package problems;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Num");
		int a = sc.nextInt();
		
		System.out.println("Enter the second Num");
		int b = sc.nextInt();
		
		System.out.println("dividing two num");
		int res=0;
		try{
			res=a/b;
		}catch(ArithmeticException ref) {
				System.out.println(" the second num cant be Zero");
		}
		
		
		
		System.out.println(res);
		

	}

}
