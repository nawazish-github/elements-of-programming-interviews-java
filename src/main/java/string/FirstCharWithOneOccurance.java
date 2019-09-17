package string;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Write a function which returns the character which is the first occurance in the string and whose occurance
    frequency is 1.
 */
public class FirstCharWithOneOccurance {
    public Character getFirstCharacter(String str) {
        char[] chars = str.toCharArray();
        LinkedHashMap<Character, Integer> freqTable = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Character ch = chars[i];
            Integer freq = freqTable.get(ch);
            if(freq == null){
                freqTable.put(ch, 1);
            }else{
                freqTable.put(ch, freq+1);
            }
        }

        for (Map.Entry<Character, Integer> entry: freqTable.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
