import java.util.*;
public class palindromicnumpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the pyramid:");
        int l = sc.nextInt();
        for(int i=1;i<=l;i++){
            int a = i;
            for(int j=l-i;j>0;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(a+" ");
                a--;
            }
            if(i>1){
                a = 2;
                for(int b=1;b<=i-1;b++){
                    System.out.print(a+" ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
