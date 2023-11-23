public class DiagonalSum {
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

    //traditional
    public static void diagonalSum(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i+j==n-1)
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }

    //Optimized
    public static void diagonalSum2(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            
            sum += arr[i][i];

            int j = n-1-i;
            if (i != j ) {
                sum += arr[i][j];
            }
              
        }

        System.out.println(sum);
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        print(arr);

        diagonalSum2(arr);
    }
}
