import java.util.*;
public class transposeMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of Matrix:");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}