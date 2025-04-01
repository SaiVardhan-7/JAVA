import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b':");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
        int operator = sc.nextInt();
        switch(operator){
            case 1 : System.out.println(a+b);
                     break;
            case 2 : System.out.println(a-b);
                     break;  
            case 3 : System.out.println(a*b);
                     break;
            case 4 : System.out.println(a/b);
                     break; 
            case 5 : System.out.println(a%b);
                     break;        
            default : System.out.println("Invalid Number");                                   
        }
    }
}
