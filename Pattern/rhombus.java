import java.util.*;
public class rhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of the rhombus:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=b-i;j>0;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=l;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}