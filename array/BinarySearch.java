class BinarySearch {
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

    public static int bs(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 8, 9, 15, 18};
        int key = 9;

        print(arr);
        int k = bs(arr, key);
        System.out.println(k);
    }
}