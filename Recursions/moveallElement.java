import java.util.*;
public class moveallElement {
    public static int count = 0;
    public static void move(String str, char ch, int index, String newstr){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newstr+=ch;
            }
            System.out.print("Result:"+newstr);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar==ch){
            count++;
        }
        else{
            newstr+=currChar;
        }
        move(str, ch, index+1, newstr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to move end: ");
        char ch = sc.next().charAt(0);
        move(str,ch,0,"");
    }
}
