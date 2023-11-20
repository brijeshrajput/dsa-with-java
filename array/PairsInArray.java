public class PairsInArray {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void pairs(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                System.out.print("("+ arr[i] +", " + arr[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 8, 9, 15, 18};

        print(arr);
        pairs(arr);
    }
}
