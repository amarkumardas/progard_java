import java.util.Scanner;

public class Task30 {
    //Task 30 :Write a program in to find the sum and average of all elements of the array.
    public static void main(String[] args) {
       int sum=0;
       float avg=0;
        System.out.println("How many number you want to insert?");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       for (int i=0;i<arr.length;i++){
                 sum=sum+arr[i];
       }
       avg=(float)sum/arr.length;
        System.out.println("Total sum: "+sum);
        System.out.println("Average :"+avg);
    }
}
