import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" and b = "+b+"");   
    }
}