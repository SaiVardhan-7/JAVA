import java.util.*;
public class pascaltriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the triangle:");
        int l = sc.nextInt();
        int c = 1;
        for(int i=0;i<=l;i++){
            for(int j=0;j<=l-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0)   c = 1;
                else   c=c*(i-k+1)/k;
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}
