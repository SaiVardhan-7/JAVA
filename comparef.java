import java.util.*;
public class comparef {
    public static void compare(float a,float b){
        if(a>b)  System.out.println(a+" is greater than "+b);
        else if(a==b)  System.out.println(a+" is equal to "+b);
        else   System.out.println(b+" is greater than "+a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        float a = sc.nextInt();
        float b = sc.nextInt();
        compare(a,b);
    }
}
