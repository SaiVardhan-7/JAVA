import java.util.*;
public class addf {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
    }
}
