import java.util.Scanner;

public class Task42 {
    //Task 42 : Accept string and count the number of alphabets, digits, spaces, special characters & words in the given string.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        int alpha,digit,spaces,specialchar;
        alpha=digit=spaces=specialchar=0;
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                alpha++;
            } else if (Character.isDigit(str.charAt(i))) {
                digit++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                spaces++;
            } else {
                specialchar++;
            }
        }

        String arr[]=str.split(" ");
        System.out.println("Number of Alphabets :"+alpha);
        System.out.println("Number of Digits :"+digit);
        System.out.println("Number of Spaces :"+spaces);
        System.out.println("Number of Special Character :"+specialchar);
        System.out.println("Number of Words :"+arr.length);
    }
}
