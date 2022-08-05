package quess;

import java.util.Scanner;

public class Task13 {
	//13. Program to print count of all prime numbers upto given number
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 System.out.println("Enter number: ");
			 int n=sc.nextInt();
			 int count=0;
			 for(int i=1; i<=n; i++){
		            if(isPrime(i)) {
		                count++; 
		            }
		        }
			    System.out.println("Total prime numbers: "+count);
			  }
		 static boolean isPrime(int n){
	          
	         if(n==1||n==0)
	        	 return false;
	         for(int i=2; i<n; i++){
	               if(n%i==0)
	            	  return false;
	         }
	         return true;
	   }

}
