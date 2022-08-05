import java.util.Scanner;

public class Task24 {
   /* Task 24 :
    Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
    If driver is married
    If driver is unmarried male and age above 30
    If driver is unmarried female and age above 25*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marital status(m/n)");
        char ch=sc.next().charAt(0);

        if(ch=='m'){
            System.out.println("Insurance approved");
        }else{
            System.out.println("Enter your Gender:(m/f)");
            char gender=sc.next().charAt(0);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if((gender=='m' && age > 30) || (gender=='f' && age > 25) ) {
                System.out.println("Insurance approved");
                }else{
                    System.out.println("Insurance not approved");
                }
            }
        }

}
