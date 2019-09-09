package array;

import java.util.Arrays;

public class SearchInASortedMatrix {
    public int[] searchInASortedMatric(int[][] matrix, int target){
        int i = 0;
        int j = matrix[0].length  - 1;

        while(i <= matrix.length-1 && j >= 0){
            if(matrix[i][j] == target)
                return new int[]{i, j};
            else
                if(matrix[i][j]>target)
                    j = j - 1;
                else
                    i = i + 1;
        }
        return new int[]{-1, -1};
    }
}
