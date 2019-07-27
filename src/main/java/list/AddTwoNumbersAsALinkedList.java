package list;

import list.util.ListNode;

/**
 * This problem was recently asked by Microsoft:
 * <p>
 * You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and
 * ach of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * Credits: http://dailyinterviewpro.com
 */
public class AddTwoNumbersAsALinkedList {

    public ListNode<Integer> addTwoNumbersAsLinkedList(ListNode<Integer> l1, ListNode<Integer> l2) {
        int first = getNumberFromList(l1);
        int second = getNumberFromList(l2);

        int sum = first + second;
        return reverseLinkedList(sum);
    }

    private int getNumberFromList(ListNode<Integer> list) {
        return Integer.parseInt(getNumberFromList(list, ""));
    }

    private String getNumberFromList(ListNode<Integer> listNode, String str) {
        if (listNode != null) {
            str = getNumberFromList(listNode.next, str);
            str = str + String.valueOf(listNode.data);
        } else {
            return "";
        }

        return str;
    }

    private ListNode<Integer> reverseLinkedList(int data) {
        int quotient = data;
        ListNode<Integer> listNode = null;
        ListNode<Integer> head = null;
        while (quotient != 0) {
            int tempQuotient = quotient / 10;
            int remainder = quotient % 10;
            quotient = tempQuotient;
            listNode = reverseLinkedList(remainder, listNode);
            if (head == null)
                head = listNode;
        }
        return head;
    }

    private ListNode<Integer> reverseLinkedList(int data, ListNode<Integer> prev) {
        if (prev == null) {
            ListNode<Integer> integerListNode = new ListNode<Integer>();
            integerListNode.data = data;
            return integerListNode;
        } else {
            ListNode<Integer> integerListNode = new ListNode<Integer>();
            integerListNode.data = data;
            prev.next = integerListNode;
            return integerListNode;
        }
    }
}
