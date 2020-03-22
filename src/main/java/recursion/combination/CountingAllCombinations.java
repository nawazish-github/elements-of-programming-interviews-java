package recursion.combination;

import java.util.List;

public class CountingAllCombinations {
    public void countCombinations (List<Integer> arr){
        Container container = new Container();
        countCombinations(arr, 0, container);
        System.out.println(container.container);
    }

    public void countCombinations (List<Integer> arr, int i, Container sum){
        if(i == arr.size()){
            sum.container = sum.container+1;
            return;
        }

        countCombinations(arr, i+1, sum);
        countCombinations(arr, i+1,  sum);
    }

    public static void main(String[] args) {
        CountingAllCombinations countingAllCombinations = new CountingAllCombinations();
        countingAllCombinations.countCombinations(List.of(1, 2));
    }

    class Container{
        int container = 0;
    }
}
