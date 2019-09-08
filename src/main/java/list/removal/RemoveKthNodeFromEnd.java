package list.removal;

import list.util.ListNode;

public class RemoveKthNodeFromEnd {

    public void removeKthNodeFromEnd(ListNode head, int k){
        ListNode node = reverse(head);
        ListNode reversedHead = node;

        if(k == 1){
            ListNode temp = node.next;
            node.next = null;
            reversedHead = temp;
            reverse(reversedHead);
            return;
        }

        int c = 1;
        while(c++ < k-1){
            node = node.next;
        }
        ListNode temp = node.next.next;
        node.next.next = null;
        node.next = temp;

        reverse(reversedHead);
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null, current, ahead;
        current = head;

        while (current != null){
            ahead = current.next;
            current.next = prev;
            prev = current;
            current = ahead;
        }
        return prev;
    }
}
