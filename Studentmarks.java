import java.util.*;
public class Studentmarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter 0 or 1:");
            number = sc.nextInt();
            System.out.print("Enter marks of the Student:");
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }
            else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            }
            else{
                System.out.println("Invalid marks");
            }
        }while(number!=0); 
    }
}
