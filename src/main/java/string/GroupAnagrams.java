package string;

import java.util.ArrayList;
import java.util.List;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> result = new ArrayList<>();
        List<Integer> marked = new ArrayList<>();
        for (int i = 0; i < words.size(); i++){
            if(!marked.contains(i)){
                List<String> temp = new ArrayList<>();
                temp.add(words.get(i));
                marked.add(i);
                for (int j = i+1; j < words.size(); j++){
                    if(words.get(i).length() == words.get(j).length() &&
                            isAnagram(words.get(i), words.get(j)) &&
                            !marked.contains(j)
                    ){
                        temp.add(words.get(j));
                        marked.add(j);
                    }
                }
                result.add(temp);
            }
        }
        return result;
    }

    public static boolean isAnagram(String str1, String str2){
        int len = str1.length();
        for(int i = 0; i < len; i++){
            if(!str2.contains(Character.toString(str1.charAt(i)))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("abc"); words.add("dabd"); words.add("bca"); words.add("cab"); words.add("ddba");
        List<List<String>> groupAnagrams = groupAnagrams(words);
        System.out.println(groupAnagrams);
    }
}
