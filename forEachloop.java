import java.util.*;

public class forEachloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements of the array:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}