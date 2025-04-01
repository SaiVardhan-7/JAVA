import java.util.*;
public class fibonnaciSequenceR {
    public static int fib(int n){
        if(n==0)   return 0;
        if(n==1 || n==2)   return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fib(i)+" ");
        }
    }
}
