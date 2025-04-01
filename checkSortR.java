/*Check if an array is sorted(strictly increasing). */
import java.util.*;
public class checkSortR {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length || idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
           return false;
        }
        return isSorted(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
