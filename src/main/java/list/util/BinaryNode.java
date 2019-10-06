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
}
