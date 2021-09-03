package dynamic_programming;

public class EditDistance {
    public int editDistance(String w1, String w2) {
        return editDistance(w1, w2, 0, 0);
    }

    private int editDistance(String w1, String w2, int i, int j) {
        if (i == w1.length()) return w2.length() - j;
        if (j == w2.length()) return w1.length() - i;

        int min = Integer.MAX_VALUE;
        if (w1.charAt(i) == w2.charAt(j)) {
            min = editDistance(w1, w2, i + 1, j + 1);
        }
        if (w1.charAt(i) != w2.charAt(j)) {
            min = Math.min(min, 1 + editDistance(w1, w2, i + 1, j + 1));
            min = Math.min(min, 1 + editDistance(w1, w2, i + 1, j));
            min = Math.min(min, 1 + editDistance(w1, w2, i, j + 1));
        }

        return min;
    }
}
