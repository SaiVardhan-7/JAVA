import java.util.*;

public class rotate90 {

    static void transpose(int arr[][], int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){        //works only for square matrix
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int matrix[]){
        int n = matrix.length;
        for(int i=0;i<=n/2;i++){
            int temp = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = temp;
        }
    }

    static void rotate(int matrix[][],int r, int c){
        //transpose matrix
        transpose(matrix, r, c);

        //reverse the elements in every row
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }
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

        System.out.println("After rotating 90 degrees the matrix");
        rotate(matrix, r, c);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
