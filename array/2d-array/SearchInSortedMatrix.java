public class SearchInSortedMatrix {
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

    // start positions -> bottom left or top right only
    public static void searchInSortedMatrix(int arr[][], int key) {
        int m = arr.length;
        int n = arr[0].length;

        //start point
        int row = 0;
        int col = n-1;

        while (row < m && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println(arr[row][col] + " is on " + row + ", " + col);
                return;
            } else if (key < arr[row][col] ) {
                col--;
            }else {
                row++;
            }
        }
        
        System.out.println("Not Found");
        
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}};
        int key = 5;

        print(arr);

        searchInSortedMatrix(arr, key);
    }
}
