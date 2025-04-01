/*Given an array of integers of size n. Answer q queries
 * where you need to print the sum of values in a given 
 * range of indices from 1 to r (both included).
 * NOTE : The values of 1 and r in queries follow 1-based indexing.
 */

import java.util.*;

public class RangeQuery {

    static int[] prefixSum(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int pref[] = prefixSum(arr);

        System.out.print("Enter no.of queries : ");
        int q = sc.nextInt();

        while(q-- >0){
            System.out.print("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l-1];

            System.out.println("Sum : "+ans);
        }

        sc.close();
    }
}
