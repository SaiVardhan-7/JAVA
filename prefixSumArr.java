/*Given an integer array 'a', return the prefix sum/running sum in the 
  same array without creating a new array.*/

import java.util.*;

public class prefixSumArr {

    static void prefixSum(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
        }
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

        prefixSum(arr);
        System.out.print("Prefix Sum of Array : ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
