package Sorting;

public class SelectionSort {
	
public static void main(String[] args) {
		
		int[] arr = {7,5,2,3,6,1,4};
		
		print(arr);
		
		System.out.println("-----------------------");
	
		selectionSort(arr);
		
		
		print(arr);

	}
	
	
	public static void selectionSort(int[] arr) {
		
		for(int i =0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
				
			}
			
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	public static void print (int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
