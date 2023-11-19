import java.util.*;

class DecToBinary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int bin = 0;
        int i = 0;
        while(n>0) {
            int rem = n%2;
            bin = bin + (int)(rem * Math.pow(2, i));
            i++;
            n = n/2;
        }

        System.out.print(bin);
    }
}