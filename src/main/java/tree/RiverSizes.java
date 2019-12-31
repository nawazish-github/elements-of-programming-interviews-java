package tree;

import java.util.ArrayList;

/**
 *                  {1,0,0,1,0},
 *                 {1,0,1,0,0},
 *                 {0,0,1,0,1},
 *                 {1,0,1,0,1},
 *                 {1,0,1,1,0}
 *
 *                 Answer: {1, 2, 2, 2, 5}
 */
public class RiverSizes {
    public ArrayList<Integer> riverSizes(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] isVisitedMatrix = new int[numRows][numCols];
        Integer sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (isVisitedMatrix[i][j] == 0){
                    int s = riverSizes(i, j, matrix, isVisitedMatrix, sum, list);
                    if (s != 0)
                        list.add(s);
                }
            }
        }
        return list;
    }

    private int riverSizes(int i, int j, int[][] matrix, int[][] isVisitedMatrix, Integer sum, ArrayList<Integer> list) {
        if (matrix[i][j]==1 && isVisitedMatrix[i][j] == 0){
            sum = sum + 1;
            isVisitedMatrix[i][j] = 1;
            if(canMoveRight(i, j, matrix)){
                sum = riverSizes(i, j+1, matrix, isVisitedMatrix, sum, list);
            }
            if (canMoveLeft(i, j, matrix)){
                sum = riverSizes(i, j-1, matrix, isVisitedMatrix, sum, list);
            }
            if (canMoveTop(i, j, matrix)){
                sum = riverSizes(i-1, j, matrix,isVisitedMatrix,sum, list);
            }
            if (canMoveDown(i, j, matrix)){
                sum = riverSizes(i+1, j,matrix,isVisitedMatrix,sum,list);
            }
        }
        return sum;
    }

    private boolean canMoveDown(int i, int j, int[][] matrix) {
        if (i < matrix.length-1)
            return true;
        return false;
    }

    private boolean canMoveTop(int i, int j, int[][] matrix) {
        if (i > 0)
            return true;
        return false;
    }

    private boolean canMoveLeft(int i, int j, int[][] matrix) {
        if (j > 0)
            return true;
        return false;
    }

    private boolean canMoveRight(int i, int j, int[][] matrix) {
        if (j < matrix[0].length-1)
            return true;
        return false;
    }

}
