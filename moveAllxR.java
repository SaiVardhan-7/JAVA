/*Move all 'x' to the end of the String. */
public class moveAllxR {
    public static void moveAllx(String str,int idx,int count,String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllx(str,idx+1,count,newStr);
        }
        else{
            newStr+=currChar;
            moveAllx(str,idx+1,count,newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllx(str, 0, 0,"");
    }
}
