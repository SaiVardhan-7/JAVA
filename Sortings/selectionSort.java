import java.util.*;
public class selectionSort {
    public static void selection(int arr[], int n){
        int i,j,minI;
        for(i=0;i<n-1;i++){
            minI = i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            int temp = arr[minI];
            arr[minI] = arr[i];
            arr[i] = temp;
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
        selection(arr,n);
    }
}
