import java.util.*;

public class CountSort {

    static int findMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static void countsort(int arr[]){
        int n = arr.length;
        int max = findMax(arr);
        int count[] = new int[max+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
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

        countsort(arr);

        System.out.print("After Sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
