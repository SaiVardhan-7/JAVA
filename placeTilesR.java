/*Place Tiles of size 1xm in a floor of size nxm. */
import java.util.*;
public class placeTilesR {
    public static int placeTiles(int n, int m){
        if(n==m)   return 2;
        if(n<m)   return 1;
        //vertically
        int verticalplacement = placeTiles(n-m, m);
        //horizontally
        int horizontalplacement = placeTiles(n-1,m);
        return verticalplacement+horizontalplacement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of 'n' and 'm':");
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        System.out.println(placeTiles(n,m));
    }
}
