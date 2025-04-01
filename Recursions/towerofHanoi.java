import java.util.*;
public class towerofHanoi{
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Disk transfer"+n+" from "+source+" to "+destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Disk transfer"+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of disks in tower of Hanoi:");
        int n = sc.nextInt();
        towerOfHanoi(n,"S","H","D");
    }
}