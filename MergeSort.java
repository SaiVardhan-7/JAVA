import java.util.*;

public class MergeSort {

    static void conquer(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int idx1 = si, idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                temp[x++] = arr[idx1++];
            }
            else{
                temp[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            temp[x++] = arr[idx1++];
        }

        while(idx2<=ei){
            temp[x++] = arr[idx2++];
        }

        for(int i=0,j=si;i<temp.length;i++,j++){
            arr[j] = temp[i];
        }
    }

    static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        
        int mid = si + (ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);
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

        divide(arr,0,n-1);

        System.out.print("After Sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
