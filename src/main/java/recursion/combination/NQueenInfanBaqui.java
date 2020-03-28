package recursion.combination;

import recursion.NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueenInfanBaqui {
    class Cell{
        Cell(int row, int col){
            this.i = row;
            this.j = col;
        }
        int i, j;

        @Override
        public String toString(){
            return "["+this.i+", "+this.j+"]";
        }
    }
    public List<Cell> nQueens(int dim){
        List<Cell> result = new ArrayList<>();
        placeQueens(dim, 0, result);
        return result;

    }

    private boolean placeQueens(int dim, int row ,List<Cell> result) {
        if(row == dim) return true;

        for (int col = 0; col < dim; col++) {
            result.add(new Cell(row, col));

            if(isSafe(row, col, result) && placeQueens(dim, row+1, result)){
                return true;
            }

            result.remove(result.size()-1);
        }

        return false;
    }

    private boolean isSafe(int row, int col, List<Cell> result) {
        for (int i = 0; i < result.size() - 1; i++) {
            int r = result.get(i).i;
            int c = result.get(i).j;

            if(c == col) return false;
            if(Math.abs(r - row) == Math.abs(c - col)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        NQueenInfanBaqui nQueenInfanBaqui = new NQueenInfanBaqui();
        List<Cell> result = nQueenInfanBaqui.nQueens(3);
        System.out.println(result);
    }


}
