package recursion;

import java.util.ArrayList;
import java.util.List;

public class PartialSubset {

    public List<List<Integer>> partialSubset(int[] arr, int k){
        return partialSubset(0, arr, 0, k);
    }

    private List<List<Integer>> partialSubset(int i, int[] arr, int currLen, int k) {

        if (currLen > k) {return new ArrayList<List<Integer>>();}
        if(arr.length == i && currLen != k) {return new ArrayList<List<Integer>>();}
        if (k > arr.length) {return new ArrayList<List<Integer>>();}


        /*if (arr.length == i){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }*/


        if(currLen == k){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }

        List<List<Integer>> returnable = new ArrayList<>();
        List<List<Integer>> inclusiveList = partialSubset(i+1, arr, currLen+1, k);
        List<List<Integer>> exclusiveList = partialSubset(i+1, arr, currLen, k);

        returnable.addAll(exclusiveList);

        for(List<Integer> l : inclusiveList){
            List<Integer> cpList = new ArrayList<>(l);
            cpList.add(arr[i]);
            returnable.add(cpList);
        }

        return returnable;
    }


    public static void main(String[] args) {
        PartialSubset partialSubset = new PartialSubset();
        List<List<Integer>> lists = partialSubset.partialSubset(new int[]{1, 2, 3}, 2);
        System.out.println(lists);
    }
}
