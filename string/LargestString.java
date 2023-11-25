public class LargestString {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Laxicographic  - wise largest string
    public static String largestString(String arr[]) {
        int n = arr.length;
 
        String largest = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String args[]) {
        String arr[] = {"apple", "mango", "banana"};
        print(arr);
        print(largestString(arr));
    }
}
