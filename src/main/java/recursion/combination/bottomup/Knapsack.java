package recursion.combination.bottomup;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Knapsack {
    public List<Integer> knapsack(List<Integer> arr, int target){
        return knapsack(arr, target, 0, 0, new ArrayList<>());
    }

    private List<Integer> knapsack(List<Integer> arr, int target, int counter, int currKnapsackWeight, List<Integer> selectedItems) {
        if(currKnapsackWeight > target) return new ArrayList<>();

        if(counter == arr.size()){
            return new ArrayList<>(selectedItems);
        }

        Integer currWeight = arr.get(counter);
        selectedItems.add(currWeight);
        List<Integer> knapsackIncl = knapsack(arr, target, counter + 1, currKnapsackWeight + currWeight, selectedItems);
        int sumIncl = knapsackIncl.stream().collect(Collectors.summingInt(Integer::intValue));

        selectedItems.remove(selectedItems.size()-1);
        List<Integer> knapsackExcl = knapsack(arr, target, counter + 1, currKnapsackWeight, selectedItems);
        int sumExcl = knapsackExcl.stream().collect(Collectors.summingInt(Integer::intValue));

        if(sumIncl > sumExcl)
            return knapsackIncl;
        else
            return knapsackExcl;
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        List<Integer> knapsackResult = knapsack.knapsack(List.of(1, 2, 3), 4);
        System.out.println(knapsackResult);
    }
}
