package list.reversal;

import list.util.ListNode;

import java.util.List;

public class ListReversal {
    public ListNode reverseList(ListNode listNode) {
        ListNode prev = null, next = null;

        while (listNode != null) {
            next = listNode.next;
            listNode.next = prev;
            prev = listNode;
            listNode = next;
        }
        return prev;
    }


    public ListNode reverseSublist(ListNode listNode, int start, int finish) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = listNode;
        ListNode<Integer> startNode, curr, hNext,next;
        int counter = 1;
        if (start == finish) {
            return listNode;
        }

        while (counter++ < start) {
            dummyHead = dummyHead.next;
        }

        startNode = dummyHead.next;
        while (start++ < finish) {
            curr = startNode.next;
            startNode.next = curr.next;
            curr.next = dummyHead.next;
            dummyHead.next = curr;
        }

        return listNode;
    }
}
