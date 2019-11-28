package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix, MazeRunner explores all possible paths to exit the maze.
 */
public class MazeRunner {

    private void findMazePaths(int[][] arr, int i, int j, int k, List<Integer> currPath, List<List<Integer>>result){
        if(i == arr.length || j == arr.length) return;

        if(arr[i][j] == k){
            List<Integer> list = new ArrayList<>(currPath);
            list.add(k);
            result.add(list);
            return;
        }

        if(j < arr.length-1){
            currPath.add(arr[i][j]);
            findMazePaths(arr, i, j+1, k, currPath, result);
            currPath.remove(currPath.size()-1);
        }

        if(i < arr.length-1){
            currPath.add(arr[i][j]);
            findMazePaths(arr, i+1, j, k, currPath, result);
            currPath.remove(currPath.size()-1);
        }

    }

    public static void main(String[] args) {
        MazeRunner mazeRunner = new MazeRunner();
        List<List<Integer>> result = new ArrayList<>();
        int[][]arr = new int[3][3];
        int counter = 0;
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j]= counter++;
            }
        }
        int k = arr[arr.length-1][arr[0].length-1];
        mazeRunner.findMazePaths(arr, 0, 0, k, new ArrayList<>(),result);
        System.out.println(result);
    }
}
