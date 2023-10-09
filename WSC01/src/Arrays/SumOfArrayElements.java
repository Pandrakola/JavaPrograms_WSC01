package Arrays;

import java.util.Scanner;

public class SumOfArrayElements{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element of the array");
		int[] a = new int[5];
		for(int i=0;i<=a.length-1;i++) {
			a[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum is: "+sum);
		

	}

}
