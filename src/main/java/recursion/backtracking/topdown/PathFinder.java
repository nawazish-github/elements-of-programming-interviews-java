package recursion.backtracking.topdown;

import java.util.ArrayList;
import java.util.List;

/**
 * Using backtracking algorithm technique to find path in a maze.
 * In the maze, from any particular cell, there are only two ways forward possible: rightwards and downwards.
 * Each cell in the maze is abstracted via the Cell class herein. It has a right and a down pointer representing
 * the two ways; a null right or down pointer would mean there is no forward path in that direction.
 */
public class PathFinder {

    public List<List<Cell>> findPath(Cell start){
        List<List<Cell>> result = new ArrayList<>();
        findPath(start, new ArrayList<Cell>(), result);

        return result;
    }

    private void findPath(Cell start, ArrayList<Cell> partial, List<List<Cell>> result) {
        if(start.value == 9){
            result.add(new ArrayList<Cell>(partial));
            return;
        }

        Cell cell = start.right;
        if(cell != null){
            partial.add(cell);
            findPath(cell, partial, result);
            partial.remove(cell); //backtrack
        }

        cell = start.down;
        if(cell != null){
            partial.add(cell);
            findPath(cell, partial, result);
            partial.remove(cell); //backtrack
        }
    }


    public static void main(String[] args) {
        Cell FINISH = new Cell(null,null, 9);
        Cell six = new Cell(null, null, 6);
        Cell three = new Cell(null, null, 3);
        Cell eight = new Cell(FINISH, null, 8);
        Cell five = new Cell(null, eight, 5);
        Cell two = new Cell(three,null, 2);
        Cell seven = new Cell(null, null, 7);
        Cell four = new Cell(five, null, 4);
        Cell one = new Cell(two, four, 1);

        PathFinder pathFinder = new PathFinder();
        List<List<Cell>> path = pathFinder.findPath(one);
        System.out.println(path);
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
