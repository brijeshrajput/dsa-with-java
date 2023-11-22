public class CountingSort {
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

    public static void bs(int arr[]){
        int n = arr.length;

        //max integer range
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        // count array
        int count[] = new int[max+1];

        // fill count array
        for (int i = 0; i<n; i++) {
            count[arr[i]]++;
        }

        int pos = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[pos] = i;
                pos++;
                count[i]--;
            }
        }


    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        print(arr);
        bs(arr);
        print(arr);
    }
}
 