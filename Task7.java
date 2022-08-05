package quess;

import java.util.Scanner;

public class Task7 {
	//Mr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency.
		 //So help out Mr. Lalwani to check which currency going to give him 3 times return
		public static void main(String[] args) {
		System.out.println("Enter currency :");
		 Scanner sc=new Scanner(System.in);
		 int currency=sc.nextInt();
		 System.out.println("Enter number of currency: ");
		 int n=sc.nextInt();
		 int noOfCurrency=n;
		 int reverse=0,remainder=0;;
		 
		 while(noOfCurrency != 0) {
			 remainder=noOfCurrency%10;
			 reverse=reverse*10+remainder;
			 noOfCurrency=noOfCurrency/10; 
		 }
		  
		 if(reverse == n) {
			 System.out.println("Your return: "+(currency*3));
		 }else {
			 System.out.println("Your return: "+currency);
		 }
			
		}
}
