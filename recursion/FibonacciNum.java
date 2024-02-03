public class FibonacciNum {
    public static void print(int n) {
        System.out.print(n + " ");
    }

    public static int nthFib(int n) {
        if(n==0 || n==1){
            return n;
        }
        
        int f = nthFib(n-1) + nthFib(n-2);
        return f;
    }


    public static void main(String args[]) {
        for (int i=0; i<5; i++) {
            print(nthFib(i));
        }
    }
}
