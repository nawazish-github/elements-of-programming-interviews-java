package string;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LongestSubsequenceTest {

    @Test
    public void test(){
        LongestSubsequence longestSubsequence = new LongestSubsequence();
        String s = longestSubsequence.longestSubsequence("abppplee", List.of("kangaroo"));
        String s1 = longestSubsequence.longestSubsequence("abppplee", List.of("able", "ale"));
        String s2 = longestSubsequence.longestSubsequence("abppplee", List.of("able", "kangaroo"));
        String s3 = longestSubsequence.longestSubsequence("abppplee", List.of("able", "ale", "apple", "bale", "kangaroo"));
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
