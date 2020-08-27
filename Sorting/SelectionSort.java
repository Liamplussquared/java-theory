import java.util.Scanner;

public class SelectionSort {

	public static void main(String args[]) {
		int arr[] = getArr();

		selectionSort(arr);
		for(int n : arr) 
			System.out.print(n + " ");

	}

	public static void selectionSort(int arr[]) {
		int min = 0, swapIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			// set first element as minimum
			min = arr[i];
			swapIndex = i;
			for(int j = i; j < arr.length; j++) {
				// if any elements smaller, update the minimum
				if (arr[j] < min) {
					min = arr[j];
					swapIndex = j;
				}
			}
			// swap positions
			swap(arr, i, swapIndex);
		}
	}

	// create and fill array from user input
	public static int[] getArr() {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		return a;
	}

	// swap two elements in array given indices 
	public static void swap(int arr[], int a, int b) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}
}