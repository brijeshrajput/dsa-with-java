public class TilingFloor {
    public static int tiling(int m, int n){ // Floor = 2 x n
        //base case
        if (n == 0 || n == 1){
            return 1;
        }

        //horizontal
        int fnm1 = tiling(m, n-1);

        //vertical
        int fnm2 = tiling(m, n-2);

        return fnm1 + fnm2;
    }

    public static void main(String args[]) {
        int m = 2;

        System.out.println(tiling(m, 4));
    }
}
