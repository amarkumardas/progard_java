package quess;

import java.util.Scanner;

public class Task18 {
	//18.	JAVA program to reverse the given number
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int rev=0,rem=0;
		 
		 while(num != 0) {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
    
		 System.out.println("reverse is: "+rev);
	}

}
