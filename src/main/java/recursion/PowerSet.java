package recursion;

import java.util.ArrayList;

public class PowerSet {

    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        powerSet.generatePowerSet(input);

        ArrayList<ArrayList<Integer>> ps = new ArrayList<>();
        ps.add(new ArrayList<>());
        powerSet.generatePowersetRecursively(input, ps, 0);
        System.out.println(ps);
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

    private void generatePowersetRecursively(ArrayList<Integer> input, ArrayList<ArrayList<Integer>> powerSet, int i){
        if (input.size() == i){
            return;
        }else{
            int size = powerSet.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> copySubset = new ArrayList<>(powerSet.get(j));
                copySubset.add(input.get(i));
                powerSet.add(copySubset);
            }
            generatePowersetRecursively(input, powerSet, i+1);
        }
    }
}


