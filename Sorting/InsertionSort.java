import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]) {
		int arr[] = getArr();

		insertionSort(arr);
		for(int n : arr) 
			System.out.print(n + " ");

	}

	public static void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int val =  arr[i];
			int j = i-1;

			while (j >= 0 && arr[j] > val) {
				// keep shifting to the right
				arr[j+1] = arr[j];
				j--;
			}

			arr[j+1] = val;
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
}