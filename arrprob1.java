/*Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.*/
import java.util.*;
public class arrprob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array of strings:");
        int n = sc.nextInt();
        String str[] = new String[n];
        int sum = 0;
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++){
            str[i] = sc.next();
            sum+=str[i].length();
        }
        System.out.println("Cumulative length of all those strings "+sum);
    }
}
