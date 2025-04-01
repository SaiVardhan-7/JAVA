import java.util.*;
class area{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of the rectangle");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int area = l*b;
		System.out.println("Area of the rectangle is "+area);
	}
}