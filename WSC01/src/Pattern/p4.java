package Pattern;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       for(int row=1;row<=n;row++) {
    	   for(int space=row;space<n-1;space++) {
    		   System.out.print("   ");
    	   }
       
    	   for(int col=1;col<=2*row-1;col++) {
    	   
    		   System.out.print(" * ");
    	   
    	   }
       
    	   System.out.println();
    	   }
       }
	
}

