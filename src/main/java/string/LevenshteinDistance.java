package string;

/**
 * Write a function that takes in two strings and returns the minimum number of edit operations that need to be
 * performed on the first string to obtain the second string. There are three edit operations: insertion of a character,
 * deletion of a character, and substitution of a character for another.
 *
 * Sample input: "abc", "yabd"
 * Samput output: 2 (insert "y"; substitute "c" for "d")
 */
public class LevenshteinDistance {

    public int levenshteinDistance (String str1, String str2){

        int lenFrom = str1.length();
        int lenTo = str2.length();

        int[][] edits = new int[lenTo+1][lenFrom+1];

        for (int i = 0; i<= lenFrom; i++)
            edits[0][i]=i;
        for (int i = 0; i <= lenTo; i++)
            edits[i][0] = i;

        for (int i = 1; i<= lenTo; i++){
            for (int j = 1; j<= lenFrom; j++){
                if (str1.charAt(j-1) != str2.charAt(i-1)){
                    edits[i][j] = Math.min(edits[i-1][j-1], Math.min(edits[i-1][j], edits[i][j-1]))+1;
                }else{
                    edits[i][j] = edits[i-1][j-1];
                }
            }
        }
        return edits[lenTo][lenFrom];
    }
}
