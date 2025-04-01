import java.util.*;
public class simpleinterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle, rate and period of time:");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        float si = (p*t*r)/100;
        System.out.println("Simple Interest is "+si);
    }
}