import java.util.*;
public class binaryToDecimal {
    public static int power(int k){
        int p=1;
        for(int i=1;i<=k;i++){
            p=p*2;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of digits of a binary number:");
        int n = sc.nextInt();
        System.out.print("Enter a binary number:");
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int sum=0;
        for(int j=b.length-1,k=0;j>=0 && k<b.length;j--,k++){
            sum = sum + (b[j]*power(k));
        }
        System.out.println(sum);
    }
}
