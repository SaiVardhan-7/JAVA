import java.util.*;

public class sortZeroAndOne {

    static void sort01(int arr[]){
        int n = arr.length;
        int zeroN = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroN++;
            }
        }

        for(int i=0;i<n;i++){
            if(i<zeroN){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
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
