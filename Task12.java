package quess;

import java.util.Scanner;

public class Task12 {
	//12. Program to print all prime numbers between given range.
		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			 int x=0,y=0;
			 do {
			 System.out.println("Enter lower limit: ");
			   x=sc.nextInt();
			 System.out.println("Enter upper limit: ");
			   y=sc.nextInt();
			   
			   if(x > y)
				   System.out.println("lower limit should be greater that upper limit");
			 }while(!(x < y));
			 int flag=0;
			 for (int i = x; i <= y; i++) {
				 
		            if (i == 1 || i == 0)
		                continue;
		            flag = 1;
		 
		            for (int j = 2; j <= i / 2; ++j) {
		                if (i % j == 0) {
		                    flag = 0;
		                    break;
		                }
		            }
		 
		            if (flag == 1)
		                System.out.print(i+" ");
		        }
			 
		}

}
