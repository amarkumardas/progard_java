import java.util.Scanner;

public class Task35 {
    //Task 35 :JAVA program to find maximum and minimum number from given array by passing array to the function.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements to insert");
        int totalNo=sc.nextInt();
        int arr[]=new int[totalNo];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max=arr[i];

            if(min > arr[i])
                min=arr[i];
        }
        System.out.println("Minimum number :"+min);
        System.out.println("Maximum number :"+max);
    }
}
