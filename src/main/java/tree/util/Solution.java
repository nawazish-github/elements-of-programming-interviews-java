package tree.util;

public class Solution <T>{
    public BinaryNode<T> head;
    public BinaryNode<T> tail;

    public Solution(BinaryNode<T> head, BinaryNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Solution() {}
}
