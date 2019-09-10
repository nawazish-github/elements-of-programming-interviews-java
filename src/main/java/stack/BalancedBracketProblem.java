package stack;

import java.util.ArrayList;

public class BalancedBracketProblem {
    public boolean balancedBrackets (String str){
        char[] chars = str.toCharArray();
        ArrayList<Character> stack = new ArrayList<>();
        for(char ch : chars){
            switch (ch){
                case '(':
                    stack.add(ch);
                    break;
                case '{':
                    stack.add(ch);
                    break;
                case '[':
                    stack.add(ch);
                    break;
                case ')':
                    if(stack.isEmpty())
                        return false;
                    Character character = stack.remove(stack.size() - 1);
                    if(!character.equals('('))
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty())
                        return false;
                    character = stack.remove(stack.size() - 1);
                    if(!character.equals('{'))
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty())
                        return false;
                    character = stack.remove(stack.size() - 1);
                    if(!character.equals('['))
                        return false;
                    break;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
