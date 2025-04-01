import java.util.*;
public class diamondpattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the diamond:");
        int n = sc.nextInt();
        //Top
        for(int i=1;i<=n/2;i++){
            for(int j=(n/2)-i;j>0;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        n=n-2;
        //Bottom
        for(int i=n/2;i>0;i--){
            for(int j=1;j<=(n/2)-i+1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
