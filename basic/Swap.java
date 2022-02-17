package basic;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		  	int arr[] = {1,3,3,2,4};
	        int n = arr.length;
	        
	        int  output =sumOfMinAbsDifferences(arr, n);
	        
	        System.out.println( "Sum = "+ output);
		
		  }
	
	 static int sumOfMinAbsDifferences(int arr[] ,int n){

		  
	        Arrays.sort(arr);
	        
	       
	        int sum = 0;
	        
	        
	       
	        
	      
	        for (int i = 0; i <= n - 2; i++)
	            sum +=Math.abs(arr[i] - arr[i+1]);
	            
	      
	        return sum; 
}     


}
