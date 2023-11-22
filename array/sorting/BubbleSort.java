public class BubbleSort {
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

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                //swap (arr[j], arr[j+1])
                if (arr[j] > arr[j+1]) {
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
                
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};

        print(arr);
        bs(arr);
        print(arr);
    }
}
