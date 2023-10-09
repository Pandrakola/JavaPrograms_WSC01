package Pattern;
//product of digits in the number.


public class ProductOfDigital {
 //function get product of digital
	static int getproduct(int n){
		int product = 1;
		while(n!=0) {
			product = product * (n%10);
			n=n/10;
		}
		return product;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4513;
       System.out.println(getproduct(n));
	}

}
