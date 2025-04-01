/*Find the number of ways in which you can invite n people to your party, single or in pairs. */
import java.util.*;
public class callGuestsR {
    public static int callGuests(int n){
        if(n<=1)   return 1;   
        //single
        int way1 = callGuests(n-1);
        //pairs
        int way2 = (n-1)*callGuests(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of guests you are going to invite:");
        int n = sc.nextInt();
        System.out.println(callGuests(n));
    }
}
