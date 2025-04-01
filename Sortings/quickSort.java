import java.util.*;
public class quickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quick(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quick(arr,low,pi-1);
            quick(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quick(arr,0,n-1);
        System.out.print("After Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*Time Complexity
    Worst : O(n^2)
   Average : O(nlogn)
 */