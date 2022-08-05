import java.util.Scanner;

public class Task31 {
    //Task 31 : Write a java program to sort the given names.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many names you want to insert?");
        int size=sc.nextInt();
        String arr[]=new String[size];
        String temp=null;
        System.out.println("Enter names :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next();
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) > 0){//return + means arr[i] is greater and - means arr[j] is greater
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted names are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
