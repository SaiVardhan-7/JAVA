/*Sum of Rectangle using prefix sum over both rows and columns.
1 1 1          1 2 3
1 1 1    ->    2 4 6 
1 1 1          3 6 9
*/

import java.util.*;

public class RectangleArrSum2 {

    static void prefixSumMat(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] +=matrix[i][j-1];
            }
        }
        //traverse vertically to calculate column-wise prefix sum
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int RectangleSum(int matrix[][], int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        prefixSumMat(matrix);

        sum = matrix[l2][r2];
        if(l1>=1){
            up = matrix[l1-1][r2];
        }
        if(r1>=1){
            left = matrix[l2 ][r1-1];
        }
        if(l1>=1 && r1>=1){
            leftup = matrix[l1-1][r1-1];
        }
        
        ans = sum - up - left +leftup;
       
        return ans;

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
