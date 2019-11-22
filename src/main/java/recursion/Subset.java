package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public List<List<Integer>> subset(int[] arr){
        /*List<List<Integer>> results = new ArrayList<>();
        subset(arr, results, new ArrayList<Integer>(), 0); //top-down
        return results;*/
        //return subset(arr, 0); //bottom up
        return subsetIterative(arr);
    }

    private void subset(int[] arr, List<List<Integer>> results, List<Integer> partialList, int i) {
        if(i == arr.length){
            results.add(partialList);
            return;
        }
        subset(arr, results, partialList, i+1);
        List<Integer> inclusiveList = new ArrayList<>(partialList);
        inclusiveList.add(arr[i]);
        subset(arr, results, inclusiveList, i+1);
    }

    private List<List<Integer>> subset(int[] arr, int i) {

        if(i == arr.length){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }

        List<List<Integer>> returnable = new ArrayList<>();
        List<List<Integer>> subset = subset(arr, i + 1);
        for(List<Integer> l : subset){
            returnable.add(new ArrayList<>(l));
            l.add(arr[i]);
            returnable.add(l);
        }
        return returnable;
    }

    private List<List<Integer>>subsetIterative(int[] arr){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        results.add(list);

        for (int i = 0; i < arr.length; i++) {
            List<List<Integer>> tmpRes = new ArrayList<>();
            for (List<Integer> l: results) {
                List<Integer> tmpList = new ArrayList<>(l);
                tmpRes.add(new ArrayList<>(tmpList));
                tmpList.add(arr[i]);
                tmpRes.add(tmpList);
            }
            results.clear();
            results.addAll(tmpRes);
        }

        return results;
    }
    public static void main(String[] args) {
        Subset subset = new Subset();
        List<List<Integer>> subset1 = subset.subset(new int[]{1, 2, 3});
        System.out.println(subset1);
    }
}
