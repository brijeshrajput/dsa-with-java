public class SelectionSort {
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

    public static void ss(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int min  = i;
            for (int j = i+1; j <= n-1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap(arr[min], arr[i])
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};

        print(arr);
        ss(arr);
        print(arr);
    }
}
