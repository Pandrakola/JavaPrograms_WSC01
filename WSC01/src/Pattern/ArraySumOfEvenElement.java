package Pattern;

public class ArraySumOfEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum = 0;
		 int a[]= {1,2,3,4,5,6};
		 
		 for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				evensum = evensum+a[i];
			}
		 }
				System.out.println("sum of even element; "+evensum);
			}
	}


