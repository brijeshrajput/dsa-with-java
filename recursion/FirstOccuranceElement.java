public class FirstOccuranceElement {
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

    public static int firstOccurance(int arr[], int i, int e) {
        int n = arr.length;
        if (i == n) {
            return -1;
        }
        
        if (arr[i] == e) {
            return i;
        }
        return firstOccurance(arr, i+1, e);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 7, 4, 12};

        print(arr);
        
        int r = firstOccurance(arr, 0, 4);

        debug("First Occurance", r);
        
    }
}
