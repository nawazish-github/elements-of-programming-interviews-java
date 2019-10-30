package recursion;

import java.util.*;

public class WordBreakII {
    static HashSet<String> dict;
    private static ArrayList<String> wordBreak_BU(String s) {
        ArrayList<String>[] ans = new ArrayList[s.length() + 1]; //array of list<string>

        for(int i = s.length(); i >= 0; i--) {
            ans[i] = new ArrayList<String>();
            for(int j = i; j < s.length(); j++) {
                if(dict.contains(s.substring(i, j+1))) {
                    ArrayList<String> al = ans[j+1];
                    for(int item = 0; item < al.size(); item++)
                        ans[i].add(s.substring(i, j+1) + " " + al.get(item));

                    // The entire string s starting from i is a valid word.
                    if (j==s.length()-1)
                        ans[i].add(s.substring(i, s.length()));
                }
            }
        }

        return ans[0];
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        /*String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";*/
        String[] wordDict = {"cat", "cats", "and", "sand", "dog"};
        /*String[] wordDict = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa",
                "aaaaaaaaaa"};*/

        dict = new HashSet<String>();

        for (int i = 0; i < wordDict.length ; i++)
            dict.add(wordDict[i]);

        // Bottom Up
        System.out.println("Bottom Up approach...");
        ArrayList<String> ans = wordBreak_BU(s);
        for(int i=0; i<ans.size(); i++) {
            System.out.println(ans.get(i));
        }

        List<List<Integer>> ml = new ArrayList<>();
        ml.add(new ArrayList<>());

    }
}
