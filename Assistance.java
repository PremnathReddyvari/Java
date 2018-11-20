import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Assistance {
	// public static String c="India";
	// public static String d="AndhraPradesh";
	public static String e = "Delhi";
	public static String f = "Amaravathi";

	// public static String g="Capital";
	public static void main(String[] args) {
		System.out.println("How can i help you ?");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String search = "time";
		if (a.toLowerCase().indexOf(search.toLowerCase()) != -1) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(sdf.format(cal.getTime()));

			// System.out.println("found time");
		} /*
			 * else { System.out.println("please enter valid data"); }
			 */

		if (a.contains("india") && a.contains("capital")) {
			System.out.println("" + e);
		} else {
			if (a.contains("andhra pradesh") && a.contains("capital")) {
				System.out.println("" + f);
			}
		}

	}
}
