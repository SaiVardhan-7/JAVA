import java.util.*;
public class ffibonacciSeries {
    public static int fibonacci(int n){
        int a=0,b=1,fib=0;
        if(n<2)   return n;
        else{
            for(int i=2;i<=n;i++){  
               fib = a + b;
               a = b;
               b =fib;
        }
        return fib;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n':");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
           System.out.print(fibonacci(i)+" ");
        }
    }
}
