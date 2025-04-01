import java.util.Arrays;
import java.util.*;

public class sortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("After Sorting : ");
        for(int k : arr){
            System.out.print(k+" ");
        }

        sc.close();
    }
    
}
