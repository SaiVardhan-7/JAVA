import java.util.*;
public class search2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows and columns of the array:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter a number to search:");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==x){
                    System.out.println(x+" is present at index "+i+","+j);
                }
            }
        }
    }
}
