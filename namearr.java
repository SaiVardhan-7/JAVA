import java.util.*;
public class namearr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        String name[] = new String[n];
        System.out.println("Enter the names in the array");
        for(int i=0;i<name.length;i++){
            name[i] = sc.next();
        }
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
    }
}
