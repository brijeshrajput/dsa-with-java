public class EvenOdd {

    public static void print(int n) {
        System.out.println(n);
    }
    public static void print(String s) {
        System.out.println(s);
    }

    public static void evenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            print("Even");
        } else {
            print("odd");
        }
    }
    public static void main(String args[]) {
        evenOdd(0);
        evenOdd(3);
        evenOdd(5);
    }
}
