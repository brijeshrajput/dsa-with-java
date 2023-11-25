public class StringCompression {
    public static void print(String s) {
        System.out.println(s);
    }

    public static String compressString(String s) {
        int n = s.length();
 
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        for (int i = 1; i < n; i++){
            while (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                
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
