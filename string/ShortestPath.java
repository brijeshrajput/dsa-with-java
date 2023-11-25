public class ShortestPath {
    public static void print(String s) {
        System.out.println(s);
    }

    public static int shortestPath(String s) {
        int n = s.length();

        int x = 0;
        int y = 0; 
        for (int i = 0; i < n; i++){
            switch (s.charAt(i)) {
                case 'E':
                    x--;
                    break;
                case 'W':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }

        int sum = (int)Math.pow(x, 2) + (int)Math.pow(y, 2);
        int d = (int)Math.sqrt(sum);
        return d;
    }

    public static void main(String args[]) {
        String s = "WNEENESENNN";
        print(s);
        System.out.println(shortestPath(s));
    }
}
