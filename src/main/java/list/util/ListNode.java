package list.util;

public class ListNode<T> {
        public ListNode(T data, ListNode<T> next) {
                this.data = data;
                this.next = next;
        }

        public ListNode() {
        }

        public T data;
        public ListNode<T> next;
}
