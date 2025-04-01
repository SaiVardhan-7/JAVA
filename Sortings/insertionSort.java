import java.util.*;
public class insertionSort {
    public static void insSort(int arr[], int n){
        int i,j,key;
        for(i=1;i<n;i++){
            key = arr[i];
            for(j=i-1;j>=0 && key<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1] = key;
        }
        System.out.print("After Sorting:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
        insSort(arr,n);
    }
}
