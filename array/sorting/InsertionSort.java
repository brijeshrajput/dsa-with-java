public class InsertionSort {
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

    public static void is(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int e = arr[i];
            int prv = i-1;
            
            while (prv >= 0 && arr[prv] > e) {
                arr[prv+1] = arr[prv];
                prv--;
            }
            arr[prv+1] = e;
        }
        
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};

        print(arr);
        is(arr);
        print(arr);
    }
}
