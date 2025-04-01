import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();
        int c = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0)   c = 1;
                else       c =c*(i-k+1)/k;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}