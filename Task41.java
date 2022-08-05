import java.util.Scanner;

public class Task41 {
    //Task 41 : Write a program check given String is Palindrome or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.next();
        StringBuffer sb=new StringBuffer(str);
        //if(str.matches())
        if(str.equals(sb.reverse().toString())){
            System.out.println("String is palindrome");
        }else
            System.out.println("String is not palindrome");
    }
}
