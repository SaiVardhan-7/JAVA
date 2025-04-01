import java.util.*;
public class prime {
    public static boolean prime(int n){
        int count = 0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
              count++;
              if(count==1)
                return false;
            }
        }    
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(prime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        } 
    }
}
