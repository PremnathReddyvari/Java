package first;

import java.util.Scanner;

public class SimilarSumArray {
	public static void main(String[] args) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("enter arary length :");
		length = input.nextInt();
		int[] arr = new int[length];
		for (int counter = 0; counter < length; counter++) {
			System.out.println("enter 1st number:" + (counter + 1));
			arr[counter] = input.nextInt();
		}
		input.close();
		System.out.println("given array is :");
		for (int counter = 0; counter < length; counter++) {
			System.out.print(arr[counter] + ",");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = 0;
				}
			}
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = 0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		System.out.println();
		for (int arr1 : arr) {
			System.out.print( arr1);
		}
	}
}