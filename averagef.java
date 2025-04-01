import java.util.*;
public class averagef {
    public static float average(int a,int b,int c){
        return (float)(a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a','b' and 'c':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = average(a,b,c);
        System.out.println("Average of "+a+" "+b+" and "+c+" is "+avg);
    }
}
