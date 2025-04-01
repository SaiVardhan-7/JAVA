/* Given an integer array 'a' sorted in non-decreasing
 * order, return an array of the squares of each number
 * sorted in non-decreasing order.
*/
import java.util.*;

public class returnArrSquareSort {

    static int[] sortSquare(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        int ans[] = new int[n];
        int k = 0;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array in non-decreasing order :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = sortSquare(arr);

        System.out.print("After Squaring non-decreasing order : ");
        for(int i : ans){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
