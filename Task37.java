import java.util.Scanner;

public class Task37 {
    //Task 37:JAVA program to find transpose of a given matrix.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows of matrix: ");
        int row=sc.nextInt();
        System.out.println("Enter column of matrix");
        int col=sc.nextInt();
        System.out.println("Enter elements in matrix: ");
        int matrix[][]=new int[row][col];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col ; j++) {
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix");
        int trans[][]=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i]=matrix[i][j];
            }
        }
        matrix=null;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row ; j++) {
                System.out.print(trans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
