public class CapitalCase {
    public static void print(String s) {
        System.out.println(s);
    }

    public static String firstLetterUpperCase(String s) {
        int n = s.length();
 
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < n; i++){
            if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "hi, i am brijesh chauhan";
        print(s);
        print(firstLetterUpperCase(s));
    }
}
