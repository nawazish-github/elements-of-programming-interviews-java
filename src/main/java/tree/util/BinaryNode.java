package tree.util;

public class BinaryNode <T> {
    public T data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(T data, BinaryNode left, BinaryNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
