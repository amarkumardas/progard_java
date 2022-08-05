import java.util.Scanner;

public class Task28 {
    //Task 28 : Find the sum of 1 to n numbers using recursion.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        System.out.println("Sum of n numbers: "+sumOfNNumbers(num));
    }

    private static int sumOfNNumbers(int num) {
        if(num==1)
            return 1;

        return num+sumOfNNumbers(num-1);

    }
}
