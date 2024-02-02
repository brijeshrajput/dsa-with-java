public class StringCompression {
    public static void print(String s) {
        System.out.println(s);
    }

    public static String compressString(String s) {
        int n = s.length();
 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            int c = 1;
            while (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                c++;
                i++;
            }

            sb.append(s.charAt(i));

            if (c > 0){
                sb.append(c);
            }

        }
        
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "aaabbcccdd";
        print(s);
        print(compressString(s));
    }
}
