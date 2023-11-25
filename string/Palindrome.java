public class Palindrome {
    public static void print(String s) {
        System.out.println(s);
    }

    public static boolean palindrome(String s) {
        int n = s.length();

        int f = 0;
        int l = n-1; 
        while (f <= l){
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }

    public static boolean palindrome2(String s) {
        int n = s.length();

        for (int i = 0; i <= n/2; i++){
            if (s.charAt(i) != s.charAt(n-1-i)) {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "abccba";
        print(s);
        System.out.println(palindrome2(s));
    }
}
