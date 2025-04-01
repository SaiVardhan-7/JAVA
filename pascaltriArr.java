/*Given an integer n, return the first n rows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers
 * directly above it.
 */
import java.util.*;

public class pascaltriArr {

    static int[][] pascal(int n){
        int ans[][] = new int[n][];

        for(int i=0;i<n;i++){
            //i th row has i+1 columns
            ans[i] = new int[i+1];
            //first and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.of rows of the Pascal triangle : ");
        int r = sc.nextInt();

        int ans[][] = pascal(r);

        System.out.println("Pacal triangle");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
