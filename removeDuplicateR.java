public class removeDuplicateR {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newStr);
        }
        else{
            map[currChar-'a']=true;
            newStr+=currChar;
            removeDuplicate(str, idx+1, newStr);
        }
    }
    public static void main(String[] args){
        String str = "aabbccjdhjcd";
        removeDuplicate(str, 0, "");
    }
}
