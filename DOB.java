package second;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DOB {
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		Scanner birthDate = new Scanner(System.in);
		System.out.print("Enter date of birth in the format dd-mm-yyyy: ");
		String input2 = birthDate.next();
		String[] split1 = input2.split("-");
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(Integer.parseInt(split1[2]), Integer.parseInt(split1[1]),
				Integer.parseInt(split1[0]));
		Period p = Period.between(birthday, today);
		System.out.println(p.getDays() + " days");
		System.out.println(p.getMonths() + " months");
		System.out.println(p.getYears() + " years");
	}

}
