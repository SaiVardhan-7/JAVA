import java.util.Arrays;
import java.util.Scanner;

public class copyArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int arr2[] = Arrays.copyOf(arr,arr.length);     // (arrName,arrLength)

        for(int k : arr2){
            System.out.print(k+" ");
        }
        System.out.println();

        int arr3[] = Arrays.copyOfRange(arr,0,arr.length); //(arrName,startIndex,endIndex)

        for(int f : arr3){
            System.out.print(f+" ");
        }
        System.out.println();

        int arr4[] = arr.clone();

        for(int l : arr4){
            System.out.print(l+" ");
        }
        sc.close();
    }
}
