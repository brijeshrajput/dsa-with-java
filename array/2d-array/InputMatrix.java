import java.util.Scanner;

public class InputMatrix {
    public static void print(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter Elements: \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        print(arr);

        
    }
}
