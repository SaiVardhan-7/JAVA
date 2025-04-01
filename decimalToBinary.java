import java.util.*;
public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n = sc.nextInt();
        int N=n;
        int i=0,r,c=0;
        while(N!=0){
            N=N/2;
            c++;
        }
        int arr[] = new int[c];
        while(n!=0){
            r=n%2;
            n=n/2;
            arr[c-i-1]=r;
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}
