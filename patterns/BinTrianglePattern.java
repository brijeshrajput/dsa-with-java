import java.util.Scanner;

public class BinTrianglePattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int v = 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                v = ((i+j)%2==0)?1:0;
                System.out.print(v);
            }
            System.out.println();
        }
    }
}
