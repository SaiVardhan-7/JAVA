import java.util.*;
public class sortedCheck {
    public static boolean sortcheck(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            return sortcheck(arr,index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean check = sortcheck(arr,0);
        if(check==true){
            System.out.println("Array is Strictly Increasing");
        }
        else{
            System.out.println("Array is not in increasing order");
        }
    }
}
