public class ArraySortedOrNot {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void debug(String s, int v) {
        
        System.out.println("Debug: "+ s + " -> " + v);
        System.out.println();
    }

    public static boolean sortedOrNot(int arr[], int i) {
        int n = arr.length;
        if (i == n-1) {
            return true;
        }
        
        if (arr[i] > arr[i+1]) {
            System.out.println("Not Sorted");
            return false;
        }
        return sortedOrNot(arr, i+1);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 7, 8, 12};

        print(arr);
        
        Boolean r = sortedOrNot(arr, 0);
        System.out.println("Sorted: " + r);

        int arr2[] = {2, 4, 7, 4, 12};

        print(arr2);
        
        Boolean r2 = sortedOrNot(arr2, 0);
        System.out.println("Sorted: " + r2);
    }
}
