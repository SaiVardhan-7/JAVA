import java.util.Scanner;

public class QuickSort {

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int arr[], int si, int ei){
        int idx = si-1;
        int pivot = arr[ei];

        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                idx++;
                swap(arr,idx,i);
            }
        }
        idx++;
        swap(arr,idx,ei);

        return idx;
    }

    static void sortq(int arr[], int si, int ei){
        if(si<ei){
            int pivot = partition(arr, si, ei);

            sortq(arr,si,pivot-1);
            sortq(arr,pivot+1,ei);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sortq(arr,0,n-1);

        System.out.print("After Sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
