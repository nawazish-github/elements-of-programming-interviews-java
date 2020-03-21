package recursion.combination.returnvalue;

import java.util.List;

public class RecursiveSummation {
    public int sum (List<Integer> numbers){
        return sum (numbers, 0);
    }

    private int sum(List<Integer> numbers, int i) {
        if(i == numbers.size()){
            return 0;
        }

        Integer currNum = numbers.get(i);
        int currSum = sum(numbers, i+1);
        return currNum+currSum;
    }

    public static void main(String[] args) {
        RecursiveSummation sum = new RecursiveSummation();
        System.out.println(sum.sum(List.of(1,2,3)));
    }
}
