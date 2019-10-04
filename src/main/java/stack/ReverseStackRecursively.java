package stack;

import java.util.ArrayList;

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
}
