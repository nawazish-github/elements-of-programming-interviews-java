package recursion.divideandconnquer;

import java.util.LinkedList;
import java.util.List;

public class ParenthesizeExpression {

    public List<String> parenthesize(String input){
        return parenthesizeMe(input);
    }

    private List<String> parenthesizeMe(String input) {
        if(input.length() <=2){
            return List.of(input);
        }
        List<String> result = new LinkedList<>();
        for (int i = 0; i <= input.length() - 2; i++) {
            String part1 = input.substring(0, i+1);
            String part2 = input.substring(i+1);
            List<String> res1 = parenthesizeMe(part1);
            List<String> res2 = parenthesizeMe(part2);
            for (String s : res1.toArray(new String[]{})) {
                for (String s2 : res2.toArray(new String[]{})) {
                    result.add(s+"("+s2+")");
                }
            }
        }
        return result;
    }
}
