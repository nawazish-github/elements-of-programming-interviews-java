package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<String> permutate(String s){
        return permutate(s, "", s.length(), new ArrayList<String>());
    }

    private List<String> permutate(String src, String partStr, int len, List<String> permutations){
        if(partStr.length() == len) {
            permutations.add(partStr);
            return permutations;
        }
        for (int i = 0; i < src.length(); i++) {
            String tempPartStr = partStr + src.charAt(i);
            String tempSrc = src.substring(0, i)+src.substring(i+1); //exception when src = "c"
            permutate(tempSrc, tempPartStr, len, permutations);

        }
        return permutations;
    }
}
