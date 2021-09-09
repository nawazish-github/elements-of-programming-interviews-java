package recursion.leetcode;

import list.util.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode toReturn = new ListNode();
        mergeTwoLists(l1, l2, toReturn, toReturn);
        return toReturn.next;
    }

    public void mergeTwoLists(ListNode l1, ListNode l2, ListNode toReturn, ListNode addHere) {

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

        if (l1.val == l2.val) {
            addHere.next = new ListNode(l1.val);
            addHere.next.next = new ListNode(l1.val);
            mergeTwoLists(l1.next, l2.next, toReturn, addHere.next.next);
        } else if (l1.val < l2.val) {
            addHere.next = new ListNode(l1.val);
            mergeTwoLists(l1.next, l2, toReturn, addHere.next);
        } else if (l2.val < l1.val) {
            addHere.next = new ListNode(l2.val);
            mergeTwoLists(l1, l2.next, toReturn, addHere.next);
        }
    }
}
