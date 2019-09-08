package recursion;

import java.util.ArrayList;

public class PowerSet {

    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        powerSet.generatePowerSet(input);
    }

    private void generatePowerSet(ArrayList<Integer> input) {
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new ArrayList<>());
        for (Integer num : input){
            int size = powerSet.size();
            for (int i = 0; i < size; i++){
                ArrayList<Integer> copySubset = new ArrayList<>(powerSet.get(i));
                copySubset.add(num);
                powerSet.add(copySubset);
            }
        }
        System.out.println(powerSet);
    }
}


