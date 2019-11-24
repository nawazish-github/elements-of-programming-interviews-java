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

    private void subsetX(int[] arr, int i, List<Integer> partialList, List<List<Integer>> results){
        if(i == arr.length){
            results.add(partialList);
            return;
        }

        subsetX(arr, i+1, partialList, results);
        List<Integer> list = new ArrayList<Integer>(partialList);
        list.add(arr[i]);
        subsetX(arr, i+1, list, results);
    }

    private List<List<Integer>>  subsetY(int[] arr, int i){
        if(i == arr.length){
            List<List<Integer>> results = new ArrayList<>();
            results.add(new ArrayList<>());
            return results;
        }


        List<List<Integer>> results = subsetY(arr, i+1);
        List<List<Integer>> toReturn = new ArrayList<>();
        for(List<Integer> l : results){
            toReturn.add(new ArrayList<>(l));
            l.add(arr[i]);
            toReturn.add(new ArrayList<>(l));
        }

        return toReturn;

    }

    private List<List<Integer>> restrictedSubset(int[] arr, int i, int k, int currLength){
        if(i == arr.length && currLength != k) return new ArrayList<List<Integer>>();
        if (k > arr.length) return new ArrayList<List<Integer>>();
        if(currLength == k){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }


        List<List<Integer>> result = new ArrayList<>();

        List<List<Integer>> inclList = restrictedSubset(arr, i+1, k,  currLength+1);
        List<List<Integer>> exclList = restrictedSubset(arr, i+1, k,  currLength);

        for(List<Integer> list : inclList){
            list.add(arr[i]);
            result.add(list);
        }
        result.addAll(exclList);

        return result;
    }


    public static void main(String[] args) {
        Subset subset = new Subset();
        //List<List<Integer>> subset1 = subset.subset(new int[]{1, 2, 3});
        //System.out.println(subset1);

        //List<List<Integer>> results = new ArrayList<>();
        //subset.subsetX(new int[]{1,2,3}, 0, new ArrayList<Integer>(), results);
        //List<List<Integer>> lists = subset.subsetY(new int[]{1, 2, 3}, 0);

        List<List<Integer>> lists = subset.restrictedSubset(new int[]{1, 2, 3}, 0, 2, 0);
        System.out.println(lists);
    }
}
