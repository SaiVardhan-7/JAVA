import java.util.*;
public class ffactorial {
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("Factorial of "+n+" is "+factorial);
    }
}
