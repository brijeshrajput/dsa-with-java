public class ReverseArray {
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

    public static void reverse(int arr[]){
        int f = 0;
        int l = arr.length - 1;

        while (f < l) {
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] =  temp;

            f++;
            l--;
        }

    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 8, 9, 15, 18};

        print(arr);
        reverse(arr);
        print(arr);
    }
}
