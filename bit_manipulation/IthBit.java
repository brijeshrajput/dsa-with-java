public class IthBit {
    public static void print(int n) {
        System.out.println(n);
    }
    public static void print(String s) {
        System.out.println(s);
    }

    public static void getBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            print(0);
        } else {
            print(1);
        }
    }

    public static void setBit(int n, int i) { //0101
        int bitMask = (1<<i);
        int num = n | bitMask;
        
        print(num);
        
    }

    public static void clearBit(int n, int i) { //0101
        int bitMask = ~(1<<i);
        int num = n & bitMask;
        
        print(num);
        
    }

    public static void updateBit(int n, int i, int v) {
        if (i == 1) {
            setBit(n, i);
        } else {
            print(n);
        }
    }

    public static void updateBit2(int n, int i, int v) {
        // nn = clearBit(n, i);
        // int bitMask = v<<i;
        // int num = nn | bitMask;
        // print(num);
    }

    public static void clearLastBits(int n, int i) {
        int nz = ~(0) << i;
        int num = n & nz;

        print(num);
    }

    public static void clearRangeBits(int n, int i, int j) {
        int a = ~(0) << (j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;

        int num = n & bitMask;

        print(num);
    }

    public static void main(String args[]) {
        // getBit(10, 2); //0
        // getBit(10, 3); //1

        // setBit(10, 2); //14

        // clearBit(10, 1); //8

        //clearLastBits(15, 2); //12

        clearRangeBits(10, 2, 4); //2
    }
}
