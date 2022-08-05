package quess;

import java.util.Scanner;

public class Task19 {
	//JAVA program to check given number is Armstrong or not
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int leng=len(num);
		 int orig=num;
		 double cub=0,sum=0;
		 while(num != 0) {
			 cub=num%10;
			 sum=sum+( Math.pow(cub, leng));
			 num=num/10;
		 }
		 if(sum==orig)
			 System.out.println("It is Armstrong number");
		 else {
			System.out.println("It is not Armstrong number");
		}
	}
	public static int len(int num) {
		int len=0;
		while(num != 0) {
			 num=num/10;
			 len++;
		 }
		return len;
	}

}
