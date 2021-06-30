package list.util;

public class BinaryNode <E> {
    public E data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(E y, BinaryNode left, BinaryNode right) {
        this.data = y;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return "left: " + this.left + " data " + this.data + " right: " + this.right;
    }
}
