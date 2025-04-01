/*Find the occurrence of the first and last occurrence of an element using recursion. */
import java.util.*;
public class elementOccuR {
    public static int first = -1;
    public static int last = -1;
    public static void findOccur(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println("First occurrence at index:"+first);
            System.out.println("Last occurrence at index:"+last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first==-1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccur(str,idx+1,element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Enter a character to find:");
        char c = sc.next().charAt(0);
        findOccur(str,0,c);
    }
}
