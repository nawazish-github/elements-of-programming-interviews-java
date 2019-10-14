package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/word-break-ii/
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 *
 * Input:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * Output:
 * [
 *   "cats and dog",
 *   "cat sand dog"
 * ]
 */
class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> sentences = new ArrayList<>();
        wordBreak(s, 0, "", "", sentences, wordDict);
        return sentences;
    }

    private void wordBreak(String s, int progPtr, String partStr, String partSent, List<String> sentences,
                           List<String> wordDict){
        if(wordDict.contains(partStr) && progPtr < s.length()){
            partSent = partSent + " " + partStr;
        }

        if(wordDict.contains(partStr) && progPtr == s.length()){
            partSent = partSent + " " + partStr;
            sentences.add(partSent.trim());
            return;
        }

        for(int i = progPtr, j = progPtr + 1; j <= s.length(); j++){
            String subStr = s.substring(i, j);
            if(!wordDict.contains(subStr)) continue;
            if(j == s.length()){
                wordBreak(s, j , subStr, partSent, sentences, wordDict);
                partSent = "";
            }else
                wordBreak(s, j , subStr, partSent, sentences, wordDict);
        }
    }

    public static void main(String[] args) {
        WordBreakII wordBreakII = new WordBreakII();
        List<String> sentences = wordBreakII.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        System.out.println(sentences);
    }
}