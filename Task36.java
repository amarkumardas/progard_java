import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Task36 {
//Task 36 :Write a menu driven program for array. Provide choice to insert, delete, search, display and exit.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    CustomArray obj=new CustomArray();
    int choice=0;
    do{
        System.out.println("\n*******************MENU**************************");
        System.out.println("1.Create array.\n2.Display elements.\n3.Insert element.\n4.Delete element.\n5.Search element.\n6.Reverse\n7.Sort\n8.EXIT");
        System.out.println("**************ENTER YOUR CHOICE*******************");
        choice = sc.nextInt();

         if (choice == 1) {
             obj.createArray();
         } else if (choice == 2) {
             obj.display();
         } else if (choice == 3) {
             obj.insert();
         } else if (choice == 4) {
             obj.delete();
         } else if (choice == 5) {
             obj.search();
         } else if (choice == 6) {
             obj.reverse();
         } else if (choice == 7) {
             obj.sort();
         } else if (choice == 8) {
             exit(0);
         } else
             System.out.println("Enter valid option");
    }while(true);
}
}
class CustomArray{
    private static int arr[];
    private static int size;
    public void delete(){
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("\n******SUB MENU********************");
                System.out.println("1.Delete First element\n2.Delete Last element\n3.Delete specific Element\n4.Go to main menu");
                System.out.println("********ENTER YOUR CHOICE***********");
                choice = sc.nextInt();
                if (choice == 1) {
                    deleteFirst(arr);
                } else if (choice == 2) {
                    deleteLast(arr);
                } else if (choice == 3) {
                    deleteGivenPosition(arr);
                } else if (choice == 4) {
                    break;
                } else
                    System.out.println("Invalid option");

            } while (true);
        }
    }
    public void deleteGivenPosition(int [] originalArr) {
        if(!isEmpty()) {
            display();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter position to delete element: ");
            int pos=sc.nextInt();
            if(!(pos <=0 )) {
                if (pos - 1 < size) {
                    int newArr[] = new int[size - 1];
                    for (int i = pos - 1; i < originalArr.length - 1; i++) {
                        originalArr[i] = originalArr[i + 1];
                    }
                    for (int i = 0; i < originalArr.length - 1; i++) {
                        newArr[i] = originalArr[i];
                    }
                    arr = newArr;
                    System.out.println("Deleted successfully");
                    System.out.println("After deleting element:");
                    size = size - 1;
                    display();
                } else
                    System.out.println("Invalid position");
            }else{
                System.out.println("Position start from 1 Enter correct position");
            }
        }
    }
    public void deleteLast(int[] originalArr) {
        if(!isEmpty()) {
            System.out.println("Before deletion in array");
            display();

            if (!(size - 1 < 0)) {
                System.out.println("Element " + originalArr[0] + " Deleted successfully");
                int newArr[] = new int[size - 1];
                for (int i = 0; i < originalArr.length-1; i++) {
                    newArr[i] = originalArr[i];
                }
                arr = newArr;
            }
            System.out.println("After deleting Last element:");
            size = size - 1;
            display();
        }
    }
    public void deleteFirst(int[] originalArr) {
      if(!isEmpty()) {
          System.out.println("Before deletion in array");
          display();
          if (!(size - 1 < 0)) {
              System.out.println("Element " + originalArr[0] + " Deleted successfully");
              int newArr[] = new int[size - 1];
              for (int i = 1; i < originalArr.length; i++) {
                  newArr[i - 1] = originalArr[i];
              }
              arr = newArr;
          }
          System.out.println("After deleting First element:");
          size = size - 1;
          display();
      }
    }
    public void search(){
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element to search: ");
            int element = sc.nextInt();
            boolean flag = false;
            int x=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    flag = true;
                    x++;
                }
            }
            if (flag) {
                System.out.println(x+" Time Element " + element + " is present in array");
                display();
            } else {
                System.out.println("Element " + element + " is not present in array");
                display();
            }
        }
    }
    public void insert(){
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("\n******SUB MENU********************");
                System.out.println("1.Insert at first\n2.Insert at last\n3.Insert at specific position\n4.Go to main menu");
                System.out.println("********ENTER YOUR CHOICE***********");
                choice = sc.nextInt();
                if (choice == 1) {
                    insertAtFirst(arr);
                } else if (choice == 2) {
                    insertAtLast(arr);
                } else if (choice == 3) {
                    insertAtGivenPosition(arr);
                } else if (choice == 4) {
                    break;
                } else
                    System.out.println("Invalid option");

            } while (true);
        }
    }
    public void insertAtGivenPosition(int[] originalArr) {
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            display();
            System.out.println("Enter position to insert");
            int pos = sc.nextInt();
            if(!(pos <=0 )) {
                if (pos - 1 == 0) {
                    insertAtFirst(originalArr);
                } else if (pos - 1 == size - 1) {
                    insertAtLast(originalArr);
                } else if (pos < size) {
                    System.out.println("Enter element:");
                    int newElement = sc.nextInt();
                    System.out.println("Before insertion in array");
                    display();
                    int newArr[] = new int[size + 1];
                    size = size + 1;
                    newArr = copyToNewArray(newArr, originalArr);
                    for (int i = newArr.length - 2; i >= pos - 1; i--) {
                        newArr[i + 1] = newArr[i];
                    }
                    newArr[pos - 1] = newElement;
                    arr = newArr;
                    System.out.println("After insertion at position: " + pos);
                    display();
                } else
                    System.out.println("Position should be less than array size: " + size);
            }else{
                System.out.println("Position start from 1 Enter correct position");
            }
        }
    }
    public void insertAtLast(int[] originalArr) {
        if(!isEmpty()) {
            System.out.println("Enter element:");
            Scanner sc = new Scanner(System.in);
            int newElement = sc.nextInt();
            System.out.println("Before insertion in array");
            display();
            int newArr[] = new int[size + 1];
            size = size + 1;
            newArr = copyToNewArray(newArr, originalArr);
            newArr[size - 1] = newElement;
            arr = newArr;
            System.out.println("After insertion at Last:");
            display();
        }
    }
    public void insertAtFirst(int[] originalArr) {
        if(!isEmpty()) {
            System.out.println("Enter element:");
            Scanner sc = new Scanner(System.in);
            int newElement = sc.nextInt();
            System.out.println("Before insertion in array");
            display();
            int newArr[] = new int[size + 1];
            size = size + 1;
            newArr = copyToNewArray(newArr, originalArr);
            for (int i = newArr.length - 2; i >= 0; i--) {
                newArr[i + 1] = newArr[i];
            }
            newArr[0] = newElement;
            arr = newArr;
            System.out.println("After insertion at First:");
            display();
        }
    }
    public int[] copyToNewArray(int[] newArr, int[] originalArr) {
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i]=originalArr[i];
        }
        return newArr;
    }
    public void createArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size=sc.nextInt();
        if(!(size <= 0)) {
            arr = new int[size];
            System.out.println("Enter elements in array :");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Created successfully:");
            display();
        }else
            System.out.println("Invalid array size:");
    }
    public boolean isEmpty(){
        if(arr!=null && !(size <= 0))
            return false;
            else {
            System.out.println("Array is empty");
            return true;
        }
    }
    public void display(){
        if(!isEmpty()){
            System.out.print("Elements in array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public void reverse(){
        if(!isEmpty()) {
            System.out.println("Elements before in array:");
            display();
            int i = 0, j = size - 1, temp = 0;
            while (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            System.out.println("Reversed successfuly: ");
            System.out.println("Elements after reversed");
            display();
        }


    }

    public void sort(){
        if(!isEmpty()) {
            display();
            int j,temp=0;
            for(int i=1;i<arr.length;i++)
            {
                temp=arr[i];//first one is considered as  sorted
                j=i-1;
                while(j>=0 && arr[j] > temp){
                    arr[j+1]=arr[j];//shifting to empty place a[j+1]
                    j--;
                }
                arr[j+1]=temp;
            }
            System.out.println("After sorting");
            display();
        }
    }
}
