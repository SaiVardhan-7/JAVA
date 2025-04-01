import java.util.*;
public class oddsumf {
    public static int oddsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int osum = oddsum(n);
        System.out.print("Sum of odd numbers up to "+n+" is "+osum);
    }
}
