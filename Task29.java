import java.util.Scanner;

public class Task29 {
    /*Task 29 :
Write a Java program to print following alphabet pattern
A B C D E
B C D E
C D E
D E
E*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of line: ");
        int num=sc.nextInt();
        int x=65;
        for(int i=num;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(x+j)+" ");
            }
            x++;
            System.out.println();
        }
    }
}
