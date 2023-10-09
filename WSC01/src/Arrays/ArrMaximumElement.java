package Arrays;

public class ArrMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {5,1,6,2,8,7};
    int max=arr[0];
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]>max) {
    		max=arr[i];
    	}
    	}
    System.out.println("maximum element of an array is;" +max);
	}

}
