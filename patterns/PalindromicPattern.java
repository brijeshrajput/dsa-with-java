import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");                              
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
}
