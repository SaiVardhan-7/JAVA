/*Print unique subsequences of a string. */
import java.util.HashSet;
public class uniqueSubsequencesStringR {
    public static void UniqueSub(String str, int idx, String newStr, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        UniqueSub(str, idx+1, newStr+currChar, set);
        //or not to be
        UniqueSub(str, idx+1, newStr, set);
    }
    public static void main(String[] args){
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        UniqueSub(str, 0, "", set);
        
    }
}
