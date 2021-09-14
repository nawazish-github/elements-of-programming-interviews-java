package recursion.leetcode;

import list.util.ListNode;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * https://leetcode.com/problems/palindrome-linked-list/submissions/
 */
public class PalindromLinkedList {
    ListNode<Integer> origNode;
    public boolean isPalindrome(ListNode<Integer> head) {
        origNode = head;
        return checkPalindrome(head);
    }

    public boolean checkPalindrome(ListNode<Integer> currNode) {
        if (currNode.next != null) {
            boolean subProbResult = checkPalindrome(currNode.next);
            origNode = origNode.next;
            return subProbResult &&  origNode.data == currNode.data;
        }

        return origNode.data == currNode.data;
    }
}
