import java.util.*;
public class functionp {
    public static void myName(){
        String myname;
        Scanner fc = new Scanner(System.in);
        System.out.print("Enter name:");
        myname = fc.nextLine();
        System.out.println(myname);
    }
    public static void main(String[] args){
        myName();
        myName();
    }
}
