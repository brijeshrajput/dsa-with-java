public class XPowerN {
    public static void println(int n) {
        System.out.println(n);
    }

    public static int xPowN(int x, int n) {  // x^n = x * x^(n-1) * ......
        if(n==0){
            return 1;
        }
        int r = x * xPowN(x, n-1);
        return r;
    }


    public static int optimizedxPowN(int x, int n) {  // x^n = x^(n/2) * x^(n/2)
        if(n==0){
            return 1;
        }

        //Less optimized
        //int r = optimizedxPowN(x, n/2)  * optimizedxPowN(x, n/2);

        //More optimized
        int r = optimizedxPowN(x, n/2);
        r = r * r;

        if (n%2 != 0){
            r = x * r;
        }
        return r;
    }


    public static void main(String args[]) {
        println(xPowN(2, 10));

        println(optimizedxPowN(2, 10));
    }
}
