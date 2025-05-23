/*Given an array of integers 'a', move all the even integers
 * at the beginning of the array followed by all the odd
 * integers. The relative order of odd or even integers does
 * not matter. Return any array that satisfies the condition.
 * */
import java.util.*;

public class sortEvenOdd {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEO(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
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

        sortEO(arr);

        System.out.print("After Sorting : ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
