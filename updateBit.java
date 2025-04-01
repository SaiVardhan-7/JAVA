import java.util.*;
public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 2;
        System.out.print("Enter 0 or 1 to update:");
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        if(oper==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int negation = ~(bitMask);
            int newNumber = negation & n;
            System.out.println(newNumber);
        }
    }
}
