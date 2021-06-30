package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RestrictedCombination4 {

    public void resComb (int[] arr){
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        resComb(0, new ArrayList<Integer>(), result, arr);
        System.out.println(result);
    }
    /*public void resComb(int idx, List<Integer> part, List<List<Integer>> result, int[] arr){
        if(part.size() == 2){result.add(part);}
        while(arr.length-1-idx > 0){
            part.add(arr[idx]);
            resComb(idx+1, part, result, arr);
            part.remove(part.size()-1);
            idx++;
        }
    }*/


    public void resComb(int idx, List<Integer> part, List<List<Integer>> result, int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            part.add(arr[i]);
            explore(i+1, part, result, arr);
            part.remove(part.size()-1);
        }
    }

    public void explore(int i, List<Integer> part, List<List<Integer>> result, int[] arr){
        for(int idx = i; idx < arr.length; idx++){
            part.add(arr[idx]);
            if(part.size() == 2) result.add(part);
            part.remove(part.size()-1);
        }
    }

    public static void main(String[] args) {
        RestrictedCombination4 restrictedCombination4 = new RestrictedCombination4();
        restrictedCombination4.resComb(new int[]{1,2,3,4});
    }
}
