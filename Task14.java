package quess;

import java.util.Scanner;

public class Task14 {
	//14. Program to find all factors of the given number
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number: ");
		 int num=sc.nextInt();
		 System.out.println("Factors are: ");
		 for(int i=1;i<=num;i++) {
			 if(num % i == 0)
				 System.out.print(i+" ");
		 }

	}

}
