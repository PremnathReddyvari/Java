package first;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		     
	      System.out.println("Enter a string to check if it is a palindrome");
	      String original = in.nextLine();
	      String[] split = original.split(" ");
	     for(int i=0;i<split.length;i++)
	     {
	    	 String st1 = split[i];
	    	 StringBuilder stbuilder = new StringBuilder();
	    	 stbuilder.append(st1);
	         stbuilder.reverse();
	         String st2 = stbuilder.toString();
	         if(st1.equals(st2))
	         {
	        	 System.out.print(" ");
	         }else{
	        	 System.out.print(st1+" ");
	         }
	    	 
	     }
	}
}
