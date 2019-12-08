package recursion;
import java.util.*;

public class NQueens {
     /*public void nQueens(int dim, int row, int col, int numQueens, List<Cell> partial, List<List<Cell>>result){

        if(partial.size() == numQueens){
            result.add(new ArrayList<>(partial));
            return;
        }
        if (row == dim || col == dim) return;
        partial.add(new Cell(row, col));
        nQueens(dim, row, col+1, numQueens, partial, result);
        nQueens(dim, row+1, 0, numQueens, partial, result);
        partial.remove(partial.size()-1);
        nQueens(dim, row, col+1, numQueens, partial, result);
        nQueens(dim, row+1, 0, numQueens, partial, result);
    }*/

    //Row-by Iteration
    public void nQueens(int dim, int numQueens, int row, Set<Integer> availableCols,
                        Set<Integer> leftDiag, Set<Integer> rightDiag, List<Cell> partial,
                        List<List<Cell>> result){

        if(partial.size() == numQueens){
            result.add(new ArrayList<>(partial));
            return;
        }

        if(row==dim) return;
        for (Integer col: availableCols.toArray(new Integer[]{})) {
            if (leftDiag.contains(row-col) || rightDiag.contains(row+col)) continue;

            partial.add(new Cell(row, col));
            availableCols.remove(col); //concurrent modification
            leftDiag.add(row-col);
            rightDiag.add(row+col);
            nQueens(dim, numQueens, row+1,  availableCols, leftDiag, rightDiag, partial, result); // row+1?

            partial.remove(new Cell(row, col));
            availableCols.add(col); //concurrent modification
            leftDiag.remove(row-col);
            rightDiag.remove(row+col);
        }
        nQueens(dim, numQueens, row+1,  availableCols, leftDiag, rightDiag, partial, result);
    }

    public static void main(String[] args) {
        /*NQueens nQueens = new NQueens();
        List<List<Integer>> result = new ArrayList<>();
        nQueens.nQueens(3, 0, 3, new ArrayList<>(), result);
        List<List<Cell>> resultCells = new ArrayList<>();
        nQueens.nQueens(4, 0, 0, 4, new ArrayList<>(), resultCells);*/
        //System.out.println(resultCells); //can filter out on resultCells to get the exact position(s)

        NQueens nQueens = new NQueens();
        List<List<Cell>> resultCells = new ArrayList<>();
        resultCells.clear();
        final int dim = 4;
        final int numQueens = 4;
        Set<Integer> availableColumns = new HashSet<>();
        for (int i = 0; i < dim; i++) {
            availableColumns.add(i);
        }
        nQueens.nQueens(dim, numQueens, 0, availableColumns,
                new HashSet<>(), new HashSet<>(),  new ArrayList<>(), resultCells);
        System.out.println(resultCells);
    }
}

class Cell{
    int x;
    int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "["+ x +", "+y+"]";
    }

    @Override
    public boolean equals(Object other) {
        Cell other1 = (Cell) other;
        if(this.x == other1.x) return true;
        if(this.y == other1.y) return true;
        if(Math.abs(other1.x-this.x) == Math.abs(other1.y-this.y)) return true;
        return false;
    }


}