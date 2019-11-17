package recursion;

import java.util.ArrayList;
import java.util.List;

public class IntegerKnapsack {
    final static int capacity = 2;

    public static void main(String[] args) {
        Item toothpaste = new Item("toothpaste", 2);
        Item toothbrush = new Item("toothbrush", 3);
        List<Item> items = new ArrayList<>();
        items.add(toothpaste);
        items.add(toothbrush);

        int maxValue = knapsack(items);
        System.out.println(maxValue);
    }

    private static int knapsack(List<Item> items) {
        List<List<Item>> combinations = knapsack(items, 0);
        int currMax = Integer.MIN_VALUE;

        for (List<Item> combination:  combinations){
            int sum = 0;
            for(Item item : combination){
                sum = sum + item.value;
            }
            if (sum <= capacity && sum > currMax){
                currMax = sum;
            }
        }
        return currMax;

    }

    private static List<List<Item>> knapsack(List<Item> items, int i) {

        if(i == items.size()){
            List<List<Item>> combinations = new ArrayList<>();
            combinations.add(new ArrayList<>());
            return combinations;
        }

        List<List<Item>> combinations = new ArrayList<>();
        for(List<Item> combination : knapsack(items, i+1)){
            combinations.add(new ArrayList<>(combination));
            combination.add(items.get(i));
            combinations.add(new ArrayList<>(combination));
        }
        return combinations;
    }
}

class Item{
    String name;
    int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
