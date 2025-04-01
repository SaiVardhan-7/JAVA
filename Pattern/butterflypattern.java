import java.util.*;

public class butterflypattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the butterfly:");
        int n = sc.nextInt();

        // Top
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= n - 2 * i; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom
        for (int i = n / 2; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = n - 2 * i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
