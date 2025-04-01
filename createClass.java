import java.util.*;
class Student{
    String name;
    int rollno;
    int age;
}
public class createClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter name, rollno and age of a Student:");
        s1.name = sc.nextLine();
        s1.rollno = sc.nextInt();
        s1.age = sc.nextInt();

        System.out.println("Name is "+s1.name+", rollno is "+s1.rollno+" and age is "+s1.age+".");
    }
}
