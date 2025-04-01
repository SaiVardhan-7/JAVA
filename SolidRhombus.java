import java.util.*;
public class SolidRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order:");
        int n = sc.nextInt();
        int j;
		for(int i=1;i<=n;i++){
		     for(j=n-i;j>=0;j--){
		        System.out.print("  ");
		    }
		    for(int k=1;k<=n;k++){
		        System.out.print("* ");
		    }
		    System.out.print("\n");
		}
    }
}