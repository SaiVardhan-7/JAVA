import java.util.*;
public class sumR {
    public static int printSum(int n){
        int sum=0;
        if(n==0)   return sum;
        return sum = n+printSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = printSum(n);
        System.out.println(sum);
    }
}
