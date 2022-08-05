import java.util.Scanner;

public class Task33 {
    //Task 33 : JAVA program to find the second largest element in an array.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalElements=0;

        do {
            System.out.println("Enter no of elements to be inserted");
             totalElements = sc.nextInt();
             if(totalElements < 2)
                 System.out.println("Atleast 2 elements should be present");
        }while(totalElements < 2);
        int arr[]=new int[totalElements];
        System.out.println("Enter elements");
        for (int i = 0; i < totalElements; i++) {
            arr[i]=sc.nextInt();
        }

        int firstLarge=Integer.MIN_VALUE,secondLarge=Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLarge){
                secondLarge=firstLarge ;
                firstLarge=arr[i];
            } else if (arr[i] > secondLarge && arr[i] != firstLarge)
                secondLarge = arr[i];

        }
        if (secondLarge == Integer.MIN_VALUE)
            System.out.println("There is no second largest"
                    + " element");
        else
            System.out.println("The second largest element"
                    + " is " + secondLarge );
    }
}
