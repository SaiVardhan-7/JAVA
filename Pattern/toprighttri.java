import java.util.*;
public class toprighttri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the triangle:");
        int l = sc.nextInt();
        for(int i=1;i<=l;i++){
           for(int j=1;j<=i;j++){
               System.out.print("  ");
           }
           for(int k=l-i+1;k>=1;k--){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}
