import java.util.*;
public class sortcheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean sort = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
               sort =  false;
            }
        }
        if(sort){
            System.out.println("Array is sorted in ascending order");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
