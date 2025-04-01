import java.util.*;

public class spiralMatrix {
    public static void main(String[] args){
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

        System.out.print("Spiral Order of Matrix:");
        int cr = 0;
        int er = rows - 1;
        int cc = 0;
        int ec = columns - 1;
        
        while(cc<=ec && cr<=er){
            for(int i=cc;i<=ec;i++){
                System.out.print(matrix[cr][i]+" ");
            }
            cr++;
            for(int j=cr;j<=er;j++){
                System.out.print(matrix[j][ec]+" ");
            }
            ec--;
            if(cr<=er){
                for(int k=ec;k>=cc;k--){
                    System.out.print(matrix[er][k]+" ");
                }
                er--;
            }
            if(cc<=ec){
                for(int l=er;l>=cr;l--){
                    System.out.print(matrix[l][cc]+" ");
                }
                cc++;
            }
        }
    }    
}
