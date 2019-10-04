package stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseStackRecursively {

    public ArrayList<Integer> reverseStack(ArrayList<Integer> list){
        int index = list.size() - 1;
        return reverseStack(list, new ArrayList<>(), index);
    }

    private ArrayList<Integer> reverseStack(ArrayList<Integer> list, ArrayList<Integer> outputList, int lastIndex) {
        if (lastIndex  < 0){
            return outputList;
        }
        reverseStack(list, outputList, lastIndex-1);
        outputList.add(list.get(lastIndex));
        return outputList;
    }

    public Stack<Integer> reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }

        int temp = stack.pop();
        reverse(stack);
        insertAtBotton(stack, temp);
        return stack;
    }

    private void insertAtBotton(Stack<Integer> stack, int num){
        if(stack.isEmpty()){
            stack.push(num);
            return;
        }

        int temp = stack.pop();
        insertAtBotton(stack, num);
        stack.push(temp);
    }
}
