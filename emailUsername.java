/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “helloWorld123@gmail.com”; username = “helloWorld123” */
import java.util.*;
public class emailUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email:");
        String email = sc.next();
        String Username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)!='@'){
                Username+=email.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(Username);
    }
}
