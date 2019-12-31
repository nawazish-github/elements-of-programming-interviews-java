package string;

public class MinCharsToPalindrom {
    public int minCharsToPalindrom(String s) {
        return minCharsToPalindromHelper(s);
    }

    private int minCharsToPalindromHelper(String s){
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 0;
        if (isPalindrom(s)) return 0;

        return 1+minCharsToPalindromHelper(s.substring(0, s.length()-1));
    }

    private boolean isPalindrom(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }
}
