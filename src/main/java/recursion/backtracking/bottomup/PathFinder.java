package recursion.backtracking.bottomup;

import java.util.ArrayList;
import java.util.List;

public class PathFinder {

    public static final int EXIT = 9;

    public static void main(String[] args) {
        Cell FINISH = new Cell(null,null, 9);
        Cell six = new Cell(null, null, 6);
        Cell three = new Cell(null, null, 3);
        Cell eight = new Cell(FINISH, null, 8);
        Cell five = new Cell(null, eight, 5);
        Cell two = new Cell(three, five, 2);
        Cell seven = new Cell(null, null, 7);
        Cell four = new Cell(five, null, 4);
        Cell one = new Cell(two, four, 1);

        PathFinder pathFinder = new PathFinder();
        List<List<Cell>> path = pathFinder.findPath(one);
        System.out.println(path);
    }

    private List<List<Cell>> findPath(Cell one) {
        return findPath(one,  0);

    }

    private List<List<Cell>> findPath(Cell cell, int i) {

        if(cell.right == null && cell.down == null && cell.value == EXIT){
            List<List<Cell>> result = new ArrayList<>();
            List<Cell> partial = new ArrayList<>();
            partial.add(cell);
            result.add(partial);
            return result;
        }

        if(cell.right == null && cell.down == null){
            List<List<Cell>> result = new ArrayList<>();
            return result;
        }

        Cell c = cell.right;
        List<List<Cell>> result = new ArrayList<>();
        if(c != null){
            List<List<Cell>> res = findPath(c, i);
            for(List<Cell> list : res){
                list.add(0, cell);
            }

            result.addAll(res);
        }

        c = cell.down;
        if(c != null){
            List<List<Cell>> res = findPath(c, i);
            for(List<Cell> list : res){
                list.add(0, cell);
            }

            result.addAll(res);
        }
        return result;
    }
}


class Cell{
    Cell right;
    Cell down;
    int value;

    public Cell(Cell right, Cell down, int value) {
        this.right = right;
        this.down = down;
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}
