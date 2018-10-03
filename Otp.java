package third;

import java.util.Random;
import third.A.RandomGenerator;

class OTPGenerator implements RandomGenerator {

	@Override
	public int random() {
		// TODO Auto-generated method stub
		return 0;

	}

}

class OTPProvider {

	public static RandomGenerator getRandomGenerator() {
		return null;
	}

}

public class Otp {
	public static void main(String[] args) {
		Random r = new Random();
		int d1 = r.nextInt(9);
		int d2 = r.nextInt(9);
		int d3 = r.nextInt(9);
		int d4 = r.nextInt(9);
		int d5 = r.nextInt(9);
		int d6 = r.nextInt(9);

		while (d1 == d2 || d1 == d3 || d1 == d4 || d1 == d5 || d1 == d6 || d2 == d3 || d2 == d4 || d2 == d5 || d2 == d6
				|| d3 == d4 || d3 == d5 || d3 == d6 || d4 == d5 || d4 == d6 || d5 == d6) {
			if (d1 == d2 || d2 == d3 || d2 == d4 || d2 == d5 || d2 == d6) {
				d2 = r.nextInt(9);
			}
			if (d1 == d2 || d2 == d3 || d2 == d4 || d2 == d5 || d2 == d6) {
				d2 = r.nextInt(9);
			}
			if (d1 == d3 || d2 == d3 || d3 == d4 || d3 == d5 || d3 == d6) {
				d3 = r.nextInt(9);
			}
			if (d1 == d4 || d2 == d4 || d3 == d4 || d5 == d4 || d6 == d4) {
				d4 = r.nextInt(9);
			}
			if (d1 == d5 || d2 == d5 || d3 == d5 || d4 == d5 || d6 == d5) {
				d5 = r.nextInt(9);
			}
			if (d1 == d6 || d2 == d6 || d3 == d6 || d4 == d6 || d5 == d6) {
				d6 = r.nextInt(9);
			}
		}
		System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6);
	}

}