/* Check if we can partition the array into two subarrays with
 * equal sum. More formally, check that prefix sum of a part of
 * the array is equal to the suffix sum of rest of the array.
*/
import java.util.*;

public class SumEqualPartition {

    static int ArraySum(int arr[]){
        int n = arr.length;
        int totalSum = 0;

        for(int i=0;i<n;i++){
            totalSum += arr[i];
        }

        return totalSum;
    }

    static boolean equalSumPartition(int arr[]){
        int n = arr.length;
        int totalSum = ArraySum(arr);
        int prefixSum = 0;

        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if(prefixSum == suffixSum){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = equalSumPartition(arr);
        if(flag==true){
            System.out.println("Partition is possible with equal sum");
        }
        else{
            System.out.println("Partion is not possible with equal sum");
        }

        sc.close();
    }
}
