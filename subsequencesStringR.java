/*Print all the subsequences of a string. */
public class subsequencesStringR {
    public static void printSubsequences(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        printSubsequences(str, idx+1, newStr+currChar);
        //or not to be
        printSubsequences(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printSubsequences(str, 0,"");
    }
}
