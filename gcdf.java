import java.util.*;
public class gcdf {
    public static int min(int a,int b){
        if(a>b)   return b;
        else if(a==b)   return a;
        else   return a;
    }
    public static int gcd(int a,int b){
        int g=0;
        for(int i=min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                g=i;
                break;
            }
        }
        return g;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = gcd(a,b);
        System.out.println("GCD of "+a+" and "+b+" is "+hcf);
    }
}
