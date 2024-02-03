public class PrintSum {
    public static void println(int n) {
        System.out.println(n);
    }

    public static int calcSum(int n) {
        if(n==1){
            return 1;
        }
        int s = n + calcSum(n-1);
        return s;
    }


    public static void main(String args[]) {
        println(calcSum(5));
    }
}
