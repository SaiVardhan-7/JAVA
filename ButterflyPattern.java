import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order:");
        int n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=n-2*i;k>0;k--){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=n-2*i;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }
}