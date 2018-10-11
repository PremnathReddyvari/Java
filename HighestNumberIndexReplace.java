package first;

import java.util.Scanner;

public class HighestNumberIndexReplace {
	static void nextNumber(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int newNumber = Integer.MAX_VALUE;
			int next = -1;
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j] && arr[j]-arr[i] < newNumber) {
					newNumber = arr[j] - arr[i];
					next = j;
				}
			}
			if (next == -1)
				System.out.print("_ ");
			else
				System.out.print(arr[next] + " ");
		}
	}

	public static void main(String[] args) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of numbers to enter :");
		length = input.nextInt();
		int[] ar = new int[length];
		for (int counter = 0; counter < length; counter++) {
			System.out.println("enter 1st number:" + (counter + 1));
			ar[counter] = input.nextInt();
		}
		input.close();
		int n = ar.length;
		nextNumber(ar, n);
	}

}
