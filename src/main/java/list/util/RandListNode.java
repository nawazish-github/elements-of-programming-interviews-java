package list.util;

public class RandListNode<T> {
    public RandListNode(T data, RandListNode<T> next) {
        this.data = data;
        this.next = next;

    }
    public RandListNode(T data) {
        this.data = data;
    }
    public T data;
    public RandListNode<T> next;
    public RandListNode<T> rand;
}