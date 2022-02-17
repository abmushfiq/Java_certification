package Sorting;

public class BubleSort {

	public static void main(String[] args) {
		
		
		
		int[] arr = {7,5,2,3,6,1,4};
		
		print(arr);
		
		System.out.println("-----------------------");
	
		BubbleSort(arr);
		
		
		print(arr);

	}
	
	
	public static void BubbleSort(int[] arr) {
		boolean swaped;
		
		for(int i = 0; i< arr.length-1 ; i++) {
			swaped = false;
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaped = true;
				}
			}
			
			if(!swaped) {
				break;
			}
		}
		
	}
	
	public static void print (int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
