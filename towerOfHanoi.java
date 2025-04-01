import java.util.*;
public class towerOfHanoi {
    public static void HanoiTower(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        HanoiTower(n-1,source,destination,helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        HanoiTower(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n':");
        int n = sc.nextInt();
        HanoiTower(n,"S","H","D");
    }
}
