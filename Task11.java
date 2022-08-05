package quess;

import java.util.Scanner;

public class Task11 {
	//11. Program to check given number is prime or not.
		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter number: ");
			 int x=sc.nextInt();
			 
			 int i,m=0,flag=0;      
			     
			  m=x/2;      
			  if(x==0||x==1){  
			   System.out.println(x+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(x%i==0){      
			     System.out.println(x+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { 
				   System.out.println(x+" is prime number"); 
				   }  
			  } 
		}
}
