import java.util.*;

public class sortZeroAndOne2 {
    
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort01(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
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

        sort01(arr);

        System.out.print("After Sorting : ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
