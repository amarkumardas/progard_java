import java.util.Scanner;

public class Task27 {
    //Task 27 : Find the table of given number using recursion
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        table(num, 1);
    }
    static void table(int num, int i)
    {
        if (i > 10)
            return ;
        System.out.println(num + " * " + i + " = " + num * i);
        table(num, i + 1);
    }
}
