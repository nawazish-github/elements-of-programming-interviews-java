package sliding_window_problems;

import java.util.HashMap;
import java.util.Map;
/**
 * 567. Permutation in String
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
   In other words, return true if one of s1's permutations is the substring of s2.

   https://leetcode.com/problems/permutation-in-string/
 */
class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> ms1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            ms1.put(c, ms1.getOrDefault(c, 0)+1);
        }
        
        Map<Character, Integer> ms2 = new HashMap<>();    
        int left = 0;
        
        SlideWindow: 
        for(int right = s1.length()-1; right < s2.length(); right++) {
            int c = left;
            while (c <= right) {
                char ch = s2.charAt(c);
                ms2.put(ch, ms2.getOrDefault(ch, 0)+1);
                c++;
            }
            
            // equate the two maps to check if permu exists
            for (Map.Entry<Character, Integer> ent : ms1.entrySet()) {
                char ch = ent.getKey();
                int val = ent.getValue();
                
                Integer val2 = ms2.get(ch);
                if (val2 == null || val != val2) {
                    //slide the window and check other window contents.
                    left++;
                    ms2.clear();
                    continue SlideWindow;
                }
            }
            return true;
        }
        return false;
    }
}