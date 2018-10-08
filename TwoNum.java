import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNum {
	

	public static void main(String[] args) throws IOException {
		
		 InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        
	        int a,b;
	        
	        System.out.println("Enter a value of a :");
	        a=Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter b valueof b :");
	        b=Integer.parseInt(br.readLine());
		if ((a+2) > b) {
			System.out.println(a);
		} else if ((b+2) > a ) {
			System.out.println(b);
		} else {
			System.out.println("numbers are equal");
		}
	}

}
