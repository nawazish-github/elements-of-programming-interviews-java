package recursion.leetcode;

import list.util.ListNode;

public class MergeTwoSortedLists {
    public ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> toReturn = new ListNode<Integer>();
        mergeTwoLists(l1, l2, toReturn, toReturn);
        return toReturn.next;
    }

    public void mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2, ListNode<Integer> toReturn, ListNode<Integer> addHere) {

        if (l1 == null && l2 == null) return;
        if (l1 == null ^ l2 == null) {
            if (l1 == null) {
                addHere.next = l2;
                return;
            } else {
                addHere.next = l1;
                return;
            }
        }

        if (l1.data == l2.data) {
            addHere.next = new ListNode<Integer>(l1.data);
            addHere.next.next = new ListNode<Integer>(l1.data);
            mergeTwoLists(l1.next, l2.next, toReturn, addHere.next.next);
        } else if (l1.data < l2.data) {
            addHere.next = new ListNode<Integer>(l1.data);
            mergeTwoLists(l1.next, l2, toReturn, addHere.next);
        } else if (l2.data < l1.data) {
            addHere.next = new ListNode<Integer>(l2.data);
            mergeTwoLists(l1, l2.next, toReturn, addHere.next);
        }
    }
}
