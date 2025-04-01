import java.util.*;
public class toggleBit {
    public static int Toggle(int n, int pos){
        int bitMask = 1<<pos;
        return n ^ bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.print("Enter the position:");
        int pos = sc.nextInt();

        int result = Toggle(n,pos);
        System.out.println("Number after toggling the bit at position " + pos + " is: " + result);
    }
}
