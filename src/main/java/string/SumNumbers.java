package string;

import java.util.LinkedList;
import java.util.List;

public class SumNumbers {
    public int sumNumbers(String str) {
        List<String> list = new LinkedList<>();
        String s = "";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                s = s+ch;
            }else{
                if(!s.isEmpty()){
                    list.add(s);
                    s = "";
                }
            }
        }
        if(!s.isEmpty()){
            list.add(s);
            s = ""; // not needed.
        }
        int sum = 0;
        if(list.size()>0){
            for(String num : list){
                sum = sum + Integer.parseInt(num);
            }
        }
        return sum;
    }
}
