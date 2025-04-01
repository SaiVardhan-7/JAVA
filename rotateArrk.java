import java.util.*;

public class rotateArrk {

    static int[] arrRotatek(int arr[], int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j = 0;

        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }

        return ans;
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

        int ans[] = arrRotatek(arr,k);

        for(int l : ans){
            System.out.print(l+" ");
        }

        sc.close();
    }
}
