import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");                              
            }
            for (int k = 0; k < 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");                              
            }
            for (int k = 0; k < 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
