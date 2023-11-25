public class TransposeMatrix {
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

    public static void transpose(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int tr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tr[i][j] = arr[j][i];
            }
        }

        print(tr);
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        print(arr);

        transpose(arr);
    }
}
