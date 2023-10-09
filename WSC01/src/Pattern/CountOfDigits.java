package Pattern;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        int num=123456;
     while(num!=0) {
    	 num=num/10;
    	 ++sum;
     }
     System.out.println("number of digits    "+sum);
	}

}
