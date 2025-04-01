import java.util.*;
public class hrect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=l;j++){
                if(i==1 || i==b || j==1 || j==l){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
