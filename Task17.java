package quess;

import java.util.Scanner;

public class Task17 {
//17.JAVA program to print sum of digits. (eg. 512 = 8)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number: ");
		 int n=sc.nextInt();
		 int sum=0,digit=0;
		 while(n !=0) {
			 digit=n%10;
			 sum=sum+digit;
			 n=n/10;
		 }
		 System.out.println("Sum of digit: "+sum);

	}

}
