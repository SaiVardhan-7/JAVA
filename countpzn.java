/*Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
 */
import java.util.*;
public class countpzn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int psum=0;
        int nsum=0;
        int zsum=0;
        int condition = 1;
        do{
            System.out.print("Enter only a integer number:");
            int n = sc.nextInt();
            if(n>0)   psum++;
            else if(n<0)   nsum++;
            else   zsum++;
            System.out.print("Enter 0 to stop or 1 to continue:");
            condition = sc.nextInt();
        }while(condition!=0);
        System.out.println("You entered");
        System.out.println(psum+" positive numbers");
        System.out.println(nsum+" negative numbers");
        System.out.println(zsum+" zero's");
    }
}
