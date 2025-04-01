/*Sum of Rectangle using Pre-Calculating the horizontal sum for each row.
1 1 1          1 2 3
1 1 1    ->    1 2 3 
1 1 1          1 2 3
*/
import java.util.*;

public class RectangleArrSum {

    static void prefixSumMat(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] +=matrix[i][j-1];
            }
        }
    }

    static int RectangleSum(int matrix[][], int l1, int r1, int l2, int r2){
        int sum = 0;
        prefixSumMat(matrix);
        
        for(int i=l1;i<=l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else{
                sum += matrix[i][r2];
            }
        }
       
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows and columns of the matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the first corner vertices of the rectangle : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter the second corner vertices of the rectangle : ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int Sum = RectangleSum(matrix, l1, r1, l2, r2);
        System.out.println("Sum of the Rectagle : "+Sum);

        sc.close();
    }
}
