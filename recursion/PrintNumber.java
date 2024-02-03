public class PrintNumber {

    public static void print(int n) {
        System.out.print(n + " ");
    }

    public static void println(int n) {
        System.out.println(n);
    }

    public static void prints(String s) {
        System.out.print(s);
    }

    public static void printDec(int n) {
        if (n == 1){
            print(n);
            return;
        }
        print(n);
        printDec(n-1);
    }

    public static void printInc(int n) {
        if (n == 1){
            print(n);
            return;
        }
        printInc(n-1);
        print(n);
        
        
    }

    public static void main(String args[]) {
        printDec(10);
        System.out.println();
        printInc(8);
    }

}
