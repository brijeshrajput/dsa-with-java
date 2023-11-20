import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");                              
            }
            for (int k = 0; k < 2*i-1; k++) { //2x-1 <-odd form
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
