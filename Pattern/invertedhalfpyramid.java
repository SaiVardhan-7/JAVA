import java.util.*;
public class invertedhalfpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of the trianle:");
        int l = sc.nextInt();
        int a = 1;
        for(int i=l;i>0;i--){
            for(int j=l-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(" "+a);
            }
            a++;
            System.out.println();
        }
    }
}
