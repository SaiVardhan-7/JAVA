import java.util.*;
public class prodf {
    public static int multiplication(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiplication(a,b);
        System.out.println("Multiplication of "+a+" and "+b+" is "+prod);
    }
}
