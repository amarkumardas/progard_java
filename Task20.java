package quess;

import java.util.Scanner;

public class Task20 {
//20.JAVA Program to Display Armstrong Number between Two Intervals.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit: ");
		int low=sc.nextInt();
		System.out.println("Enter upper limit: ");
		int upper=sc.nextInt();
		double cub=0, sum=0;
		int k=0;
		System.out.print("Armstrong number are: ");
		int flag=0;
		int leng=0;
		for(int i=low; i<=upper;i++) {
			k=i;
			leng=len(i);
			 
			sum=0;
			while(k != 0) {
				cub=k%10;
				sum=sum+( Math.pow(cub, leng));
				k=k/10;
			}
			 
			if(i==sum) {
				System.out.print(i+" ");
				flag=1;
			} 
		}
		
		if(flag==0) {
			System.out.println("null");
		}

	}
	public static int len(int num) {
		int x=0;
		while(num != 0) {
			 num=num/10;
			 x++;
		 }
		return x;
	}

}
