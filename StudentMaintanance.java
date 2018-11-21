package com.studentmaintanance;

import java.util.LinkedHashMap;
import java.util.Scanner;

import model.Student;

public class StudentMaintanance {

	public static void main(String[] args) {
		String[] removing={"add","insert","place","put","for","the","name"};
		String[] keyword={"first","last","typecode","typedescription","email","emailid","password","matrialtype"};
		System.out.println("Please enter student details");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		/* a.replaceAll("name", ""); */
		String output = a.replaceAll("\\b\\w{1,2}\\s\\s?", "");
			
		for(int i=0;i<removing.length;i++){
			if(output.contains(removing[i])){
				System.out.println("inside if");
				output=output.replaceAll(removing[i], "");
			}
		}output=output.replaceAll("( )+", " ");	
		
		System.out.println(output);

		// int count = 0;
		//
		// for (int i = 0; i < a.length(); i++) {
		// if (a.charAt(i) == ' ') {
		// System.out.println("count is " + count);
		// count = 0;
		// } else {
		// count++;
		// }
		// }
		// System.out.println("count is " + count);

		String[] b = output.split("and ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(" " + b[i]);
		}
		LinkedHashMap<Integer, String> ihm = new LinkedHashMap<>();
		for (int i = 0; i < b.length; i++) {
			ihm.put(i, b[i]);

		}
		String[] str1 = ihm.get(0).split("\\s");
		String[] str2 = ihm.get(1).split("\\s");
		String[] str3 = ihm.get(2).split("\\s");
		String[] str4 = ihm.get(3).split("\\s");
		Student s=new Student();
		int j=0;
		System.out.println("Switch Begins");
		do{System.out.println("times of "+j);
			switch(str1[j]){
			case "first":
				System.out.println("line no 59 inside first switch");
				if(j==0){
				System.out.println("first " +str1[j+1]);
				s.setFirstname(str1[j+1]);}
				else{
					System.out.println("first "+str1[j-1]);
					s.setFirstname(str1[j-1]);
				}
				break;
			case "last":
				if(j==0)
				s.setLastname(str1[j+1]);
				else
					s.setLastname(str1[j-1]);
				break;
			case "password":
				if(j==0)
				s.setPassword(str1[j+1]);
				else
					s.setPassword(str1[j-1]);
				break;
			case "email":
				if(j==0)
				s.setEmailid(str1[j+1]);
				else
					s.setEmailid(str1[j-1]);
				break;
			}j++;
		}while(j<str1.length);j=0;
		do{
			switch(str2[j]){
			case "first":
				if(j==0)
				s.setFirstname(str2[j+1]);
				else
				s.setFirstname(str2[j-1]);
				break;
			case "last":
				if(j==0){
				System.out.println("last");
				s.setLastname(str2[j+1]);}else
					s.setLastname(str2[j-1]);
				break;
			case "password":
				if(j==0)
				s.setPassword(str2[j+1]);
				else
				s.setPassword(str2[j-1]);
				break;
			case "email":
				if(j==0)
				s.setEmailid(str2[j+1]);
				else
					s.setEmailid(str2[j-1]);
				break;
			}j++;
		}while(j<str1.length);j=0;
		do{
			switch(str3[j]){
			case "first":
				if(j==0)
				s.setFirstname(str3[j+1]);
				else
				s.setFirstname(str3[j+1]);
				break;
			case "last":
				if(j==0)
				s.setLastname(str3[j+1]);
				else
					s.setLastname(str3[j-1]);
				break;
			case "password":
				if(j==0)
				s.setPassword(str3[j+1]);
				else
				s.setPassword(str3[j-1]);
				break;
			case "email":
				if(j==0)
				s.setEmailid(str3[j+1]);
				else
				s.setEmailid(str3[j-1]);
				break;
			}j++;
		}while(j<str1.length);j=0;
		do{
			switch(str4[j]){
			case "first":
				if(j==0)
				s.setFirstname(str4[j+1]);
				else
				s.setFirstname(str4[j-1]);
				break;
			case "last":
				if(j==0)
				s.setLastname(str4[j+1]);
				else
					s.setLastname(str4[j-1]);
				break;
			case "password":
				if(j==0)
				s.setPassword(str4[j+1]);
				else
					s.setPassword(str4[j-1]);
				break;
			case "email":
				if(j==0)
				s.setEmailid(str4[j+1]);
				else
				s.setEmailid(str4[j+1]);
				break;
			}
			j++;
		}while(j<str1.length);
		System.out.println("Student Object has been following...");
		System.out.println("FirstName "+s.getFirstname()+" Last Name "+s.getLastname()+" Email "+s.getEmailid()+" Password "+s.getPassword());
		/*while(j<ihm.size()){
			if(str1[j].equals("first")){
				
			}
			if(str2[j].equals("first")){
				s.setFirstname(str2[j+1]);
			}
			if(str3[j].equals("first")){
				s.setFirstname(str3[j+1]);
			}
			if(str4[j].equals("first")){
				s.setFirstname(str4[j+1]);
			}
			j++;
		}*/
		/*for (int i = 0; i < str1.length; i++)
			System.out.print(str1[i]);
		for (int i = 0; i < str2.length; i++)
			System.out.print(str2[i]);
		for (int i = 0; i < str3.length; i++)
			System.out.println(str3[i]);
		for (int i = 0; i < str4.length; i++)
			System.out.println(str4[i]);*/

		// str[]=ihm.get(i).split("\\s");
		// System.out.println(","+b);
		// int firstIndex = a.indexOf("firstname");
		// System.out.println("firstname" + firstIndex);
		// int lastIndex = a.lastIndexOf("firstname");
		// System.out.println("firstname" + lastIndex);

	}

}
