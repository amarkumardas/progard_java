package quess;

import java.util.Scanner;

public class Task21 {
	//21. Find the greater between four numbers using Nested Conditional Operator.
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 4 numbers: ");
		 int a,b,c,d,result;
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 d=sc.nextInt();

 result=(a>b&&a>c&&a>d)?a:(b>c&&b>d )?b:(c>d )?c:d;
 System.out.println("Greater number : "+result);
		 
		 

	}

}
