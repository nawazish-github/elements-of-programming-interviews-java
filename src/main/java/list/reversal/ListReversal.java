package list.reversal;

import list.util.ListNode;

public class ListReversal {
    public ListNode reverseList(ListNode listNode) {
        ListNode prev = null, next = null;

        while (listNode!=null){
            next = listNode.next;
            listNode.next = prev;
            prev = listNode;
            listNode = next;
        }
        return prev;
    }
}
