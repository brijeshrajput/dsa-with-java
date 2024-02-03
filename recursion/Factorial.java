public class Factorial {
    public static void println(int n) {
        System.out.println(n);
    }

    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        int f = n * fact(n-1);
        return f;
    }


    public static void main(String args[]) {
        println(fact(5));
    }
}
