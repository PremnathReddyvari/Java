package first;

import java.util.Scanner;

public class PrintStringPattern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.println("enter he string :");
		String st = a.next();
		char[] ca = st.toCharArray();

		for (int i = 0; i < ca.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ca[j] + " ");
			}
			System.out.println();
		}
		for (int i = ca.length - 2; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ca[j] + " ");
			}
			System.out.println();
		}

	}

}
