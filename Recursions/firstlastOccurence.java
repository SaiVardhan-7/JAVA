import java.util.*;
public class firstlastOccurence {
    public static int first = Integer.MIN_VALUE;
    public static int last = Integer.MIN_VALUE;
    public static void occurence(String str,int index, char ch){
        if(index==str.length()-1){
            System.out.println("First and Last occurence of "+ch+" at "+first+" and "+last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar==ch){
            if(first==Integer.MIN_VALUE){
                first = index;
            }
            else{
                last = index;
            }
        }
        occurence(str, index+1, ch);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        System.out.print("Enter an element:");
        char ch = sc.next().charAt(0);
        occurence(str,0,ch);
    }
}
