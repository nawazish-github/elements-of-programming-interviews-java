package recursion.leetcode;

import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromLinkedListTest {

    @Test
    public void test() {
        PalindromLinkedList palindromLinkedList = new PalindromLinkedList();
        ListNode headhead = new ListNode<Integer>(1, null);
        ListNode l1twotwo = new ListNode<Integer>(2, headhead);
        ListNode l1threethree = new ListNode<Integer>(3, l1twotwo);

        ListNode l1three = new ListNode<Integer>(3, l1threethree);
        ListNode l1two = new ListNode<Integer>(2, l1three);
        ListNode head = new ListNode<Integer>(1, l1two);

        boolean isPalindrom = palindromLinkedList.isPalindrome(head);
        Assertions.assertTrue(isPalindrom);
    }

}