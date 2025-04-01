import java.util.*;

public class rotateArrk2 {

    static void reverse(int arr[],int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    static void arrRotatek(int arr[], int k){
        int n = arr.length;

        reverse(arr,0,n-k-1);   //reverse part1
        reverse(arr,n-k,n-1);     //reverse part2
        reverse(arr,0,n-1);     //reverse total

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

        System.out.print("Enter no.of times to rotate : ");
        int k = sc.nextInt();

        arrRotatek(arr,k);

        for(int l : arr){
            System.out.print(l+" ");
        }

        sc.close();
    }
}