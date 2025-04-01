import java.util.*;
public class numpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid:");
        int l = sc.nextInt();
        int a = 1;
        for(int i=1;i<=l;i++){
            for(int j=l-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+a);
            }
            a++;
            System.out.println();
        }
    }
}
