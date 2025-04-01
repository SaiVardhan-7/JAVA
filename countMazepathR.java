import java.util.*;
public class countMazepathR {
    public static int mazecount(int cr, int cc, int er, int ec){
        int rightways = 0 , downways = 0;
        if(cr==er && cc==ec)   return 1;
        if(cr==er){
            rightways += mazecount(cr, cc+1, er, ec);
        }
        if(cc==ec){
            downways += mazecount(cr+1, cc, er, ec);
        }
        if(cr<er && cc<ec){
            rightways += mazecount(cr, cc+1, er, ec);
            downways += mazecount(cr+1, cc, er, ec);
        }
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int totalways = mazecount(1, 1, rows, columns);
        System.out.println("Total mazepaths are:"+totalways);
    }
}
