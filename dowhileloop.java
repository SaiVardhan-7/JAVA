import java.util.*;
public class dowhileloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=1;
        do{
            System.out.print(i+" "); 
            i++;
        }while(i<=n);
    }
}
