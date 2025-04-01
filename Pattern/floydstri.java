import java.util.*;
public class floydstri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the triangle:");
        int l = sc.nextInt();
        int a = 1;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
