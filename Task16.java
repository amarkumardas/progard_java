package quess;

import java.util.Scanner;

public class Task16 {
//16. Program to find all prime factors of given number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		 int num=sc.nextInt();
		 int n=num;
		 System.out.print("All prime factors are: ");
		 for(int i=2;i<=num;i++) {
			 if(n % i == 0) {
				 System.out.print(i+" ");
				 n=n/i;
				 i--;
			 }	 
		 }
	}
	 
	 
      

}
