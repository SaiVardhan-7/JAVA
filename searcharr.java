import java.util.*;
public class searcharr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value to search:");
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){            // i<n ---> i<arr.length
            if(arr[i]==x){
                System.out.println(x+" is present at index "+i);
            }
        }
    }
}
