import java.util.Scanner;

public class CharacterPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        char ch = 'a';
        for (int i = 1; i<=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
