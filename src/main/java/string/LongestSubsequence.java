package string;

import java.util.List;

public class LongestSubsequence {

    public String longestSubsequence (String s, List<String> list){
        boolean charFound = false;
        String longSubsequence = null;
        for (String item : list) {
            charFound = false;
            int idx = 0;
            for (char ch : item.toCharArray()) {
                char[] c = s.toCharArray();
                for (int i = idx; i < c.length; i++) {
                    if (ch == c[i]){
                        idx = i;
                        charFound = true;
                        break;
                    }
                }
                if(!charFound) {
                    break;
                }
            }
            if(!charFound){
                break;
            }
            if (longSubsequence != null && longSubsequence.length() < item.length()){
                longSubsequence = item;
            }
            if(longSubsequence == null){
                longSubsequence = item;
            }
        }
        if(!charFound && longSubsequence == null) return null;
        return longSubsequence;
    }
}
