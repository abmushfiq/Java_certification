package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {7,5,2,3,6,1,4};
		
		print(arr);
		
		System.out.println("-----------------------");
	
		insertionSort(arr);
		
		
		print(arr);

	}
	
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for(int j = i+1; j>0 ; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void print (int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
