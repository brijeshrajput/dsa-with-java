public class LastOccuranceElement {
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

    public static int lastOccurance(int arr[], int i, int e) {
        int n = arr.length;
        if (i == n) {
            return -1;
        }

        //Look Farward
        int l = lastOccurance(arr, i+1, e);

        //to stop further match
        if (l != -1) {
            return l;
        }

        //Look Self
        if (arr[i] == e) {
            return i;
        }

        return l;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 7, 4, 12, 6, 3};

        print(arr);
        
        int r = lastOccurance(arr, 0, 4);

        debug("Last Occurance", r);
        
    }
}
