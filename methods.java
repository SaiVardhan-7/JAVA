import java.util.*;

class Operations {

    int sum(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int prod(int a, int b){
        return a*b;
    }
    double division(double a, double b){
        return a/b;
    }
}

class Students{
    String name;
    int age;
    double marks;
}

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'a' and 'b' : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Operations obj = new Operations();

        int result1 = obj.sum(a,b);
        int result2 = obj.sub(a,b);
        int result3 = obj.prod(a,b);
        double result4 = obj.division(a,b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        Students s1 = new Students();
        
        System.out.print("Enter student name, age and marks : ");
        s1.name = sc.next();
        s1.age = sc.nextInt();
        s1.marks = sc.nextDouble();

        System.out.println(s1.name+"\t"+s1.age+"\t"+s1.marks);

        sc.close();
    }
}