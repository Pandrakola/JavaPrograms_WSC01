package Pattern;

public class FactorialOfNumber {

	
	
	public static int Fact(int input){ 
		int fact=1;
		
		for(int i=1;i<=input;i++) {
			fact = fact*i;
		}
			return fact;
			
		
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
          int input = 5;
          int result = Fact(input);
		
		System.out.println(result);
	}
	}

