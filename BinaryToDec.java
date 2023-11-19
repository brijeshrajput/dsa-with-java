import java.util.*;

class BinaryToDec {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int dec = 0;
        int i = 0;
        while (n > 0) {
            int ld = n%10;
            dec = dec + (int)(ld * Math.pow(2, i));
            i++;
            n = n/10;
        }

        System.out.print(dec);
    }
}