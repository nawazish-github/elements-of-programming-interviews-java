package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringInterleave {

    public List<String> interleaveStrings (String s1,  String s2){
        /*List<String> result = new ArrayList<>();
        int length = s1.length() + s2.length();
        int s1Len = s1.length();
        int s2Len = s2.length();
        int[] positionalArray = new int[s1Len + s2Len];
        for (int i = 0; i < length; i++){
         positionalArray[i] = i;
        }

        List<List<Integer>> positionalCombinations = combinations(positionalArray, s1Len);
        compose(positionalCombinations, result, length, s1, s2);
        return result;*/

        return stringInterleaveII(s1, s2, 0, 0, new StringBuffer(), new ArrayList<>());
    }

    private void compose(List<List<Integer>> combos, List<String> result, int length, String s1, String s2) {
        char[] combination = new char[length];
        for(List<Integer> posList : combos){
            int string1Counter = 0;
            for(int i : posList){
                    combination[i] = s1.charAt(string1Counter++);
            }

            int string2Counter = 0;
            for(int i = 0; i < length; i++){
                if(!posList.contains(i)){
                    combination[i] = s2.charAt(string2Counter++);
                }
            }
            result.add(new String(combination));
        }
    }


    private List<List<Integer>> combinations(int[] arr, int k){
        return combinations(arr, k, 0, 0);
    }

    private List<List<Integer>> combinations(int[] arr, int k, int currLen, int i) {

        if(currLen > k) return new ArrayList<>();
        if(i == arr.length && currLen != k) return new ArrayList<>();
        if(currLen == k){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> incl = combinations(arr, k, currLen + 1, i + 1);
        List<List<Integer>> excl = combinations(arr, k, currLen , i + 1);
        for(List<Integer> list : incl){
            list.add(0, arr[i]);
            result.add(list);
        }
        result.addAll(excl);

        return result;
    }

    private List<String> stringInterleaveII(String s1, String s2, int i, int j, StringBuffer partialStr,
                                            List<String> result){

        /*if(i == s1.length() && j == s2.length()){
            result.add(partialStr.toString());
            return result;
        }*/

        if(partialStr.length() == s1.length()+s2.length()){
            result.add(partialStr.toString());
            return result;
        }

        if(i <  s1.length()){
            partialStr.append(s1.charAt(i));
            stringInterleaveII(s1, s2, i+1, j, partialStr, result);
            partialStr.deleteCharAt(partialStr.length()-1);
        }

        if(j < s2.length()){
            partialStr.append(s2.charAt(j));
            stringInterleaveII(s1, s2, i, j+1, partialStr, result);
            partialStr.deleteCharAt(partialStr.length()-1);
        }

        return result;
    }

    public static void main(String[] args) {
        StringInterleave stringInterleave = new StringInterleave();
        List<String> result = stringInterleave.interleaveStrings("ab", "cd");
        System.out.println(result);
    }
}
