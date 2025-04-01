import java.util.*;
public class powerf {
    public static int power(int x,int n){
        int p = 1;
        for(int i=1;i<=n;i++){
            p*=x;
        }
        return p;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'x' and 'n':");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int p = power(x,n);
        System.out.println(x+" to the power of "+n+" is "+p);
    }
}
