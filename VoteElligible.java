import java.util.*;
public class VoteElligible {
    public static boolean voteElligible(int n){
        if(n>=18)   return true;
        else   return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person:");
        int age = sc.nextInt();
        System.out.print(voteElligible(age));
    }
}