public class MaxSubArraySum {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subarr(int arr[]){
        int f = 0;
        int l = arr.length - 1;

        for (int i = 0; i <= l; i++) {
            for (int j = i; j <= l; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 8, 9, 15, 18};

        print(arr);
        subarr(arr);
    }
}
