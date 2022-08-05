import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task34 {
    //Task 34 :JAVA program to input n number of elements in an array and separate them into even and odd two different arrays.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements to be inserted: ");
        int totalElement=sc.nextInt();
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int arr[]=new int[totalElement];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
                if(arr[i]==0)
                    continue;
                if(arr[i]%2==0)
                    even.add(arr[i]);
                else
                    odd.add(arr[i]);
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);

    }
}
