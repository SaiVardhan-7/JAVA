/*Print x^n (with stack height = n) */
import java.util.*;
public class calculatePower {
    public static int calcPower(int x,int n){
        if(n==0)   return 1;
        if(x==0)   return 0;
        return x*calcPower(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'x' and 'n':");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int power = calcPower(x,n);
        System.out.println(power);
    }
}
