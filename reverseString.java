import java.util.*;
public class reverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        int n = sb.length();
        for(int i=0;i<n/2;i++){
            int front = i;
            int back = n-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}