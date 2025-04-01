import java.util.*;

public class bubbleSort {
    public static void bubble(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true)
                break;
        }

        System.out.print("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble(arr, n);
    }
}
