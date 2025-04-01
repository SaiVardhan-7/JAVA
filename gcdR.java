import java.util.*;
public class gcdR{
    public static int gcd(int a, int b){
        if(b==0)   return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = gcd(a,b);
        System.out.println("Greatest Common Divisor = "+hcf);
    }
}