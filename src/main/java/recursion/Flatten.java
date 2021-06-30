package recursion;

import java.util.ArrayList;
import java.util.List;

public class Flatten {
    List<Integer> flatten(int[][] arr){
        return flatten (0, arr, new ArrayList<Integer>());
    }

    private List<Integer> flatten(int i, int[][] arr, ArrayList<Integer> list) {
        if(i == arr.length) return list;
        flatten (i, 0, arr, list);
        return flatten(i+1, arr, list);
    }

    private void flatten(int i, int j, int[][] arr, ArrayList<Integer> list) {
        if(j == arr[i].length) return;
        list.add(arr[i][j]);
        flatten(i, j+1, arr, list);
    }
}
