import java.util.Scanner;
public class BubbleSort {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);

		for(int n : arr) 
			System.out.print(n + " ");
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}

	public static void swap(int arr[], int a, int b) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}
}