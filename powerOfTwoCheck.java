import java.util.*;
public class powerOfTwoCheck {
    public static boolean twoPowerCheck(int n){
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(twoPowerCheck(n)){
            System.out.println(n+" is a power of 2.");
        }
        else{
            System.out.println(n+" is not a power of 2.");
        }
    }
}
