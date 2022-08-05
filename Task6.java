package quess;

import java.util.Scanner;

public class Task6 {
	/*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string. Note: input will never be an empty string*/
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter string: ");
	     String str=sc.nextLine(); 
		   
		 char []ch= str.toCharArray();
		 
		 for(int i=0;i<str.length();i++) {
			 
			 if(Character.getNumericValue(str.charAt(i)) < 5)
				 ch[i]='0';
			 else 
				 ch[i]='1';
			 
		 }
		 for(int i=0;i<ch.length;i++) {
		   System.out.print(ch[i]);
		 }
		 

	}

}
