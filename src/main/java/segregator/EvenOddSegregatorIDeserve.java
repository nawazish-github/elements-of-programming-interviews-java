package segregator;

import list.util.ListNode;

/**
 * Segregates even and odd valued nodes in a LinkedList maintaining
 * the order of even and odd sublists. The resultant LinkedList
 * starts with even sublist followed by odd one.
 *
 * Input: 1, 2, 4, 3, 6
 * Output: 2, 4, 6, 1, 3
 *
 * Input: 1, 3, 5, 7
 * Output: 1, 3, 5, 7
 */
public class EvenOddSegregatorIDeserve {

    public ListNode segregate(ListNode<Integer> listNode){
        ListNode even = new ListNode();
        ListNode odd = new ListNode();

        ListNode evenPtr = even;
        ListNode oddPtr = odd;

        while(listNode!=null){
            if (listNode.data%2==0){
                evenPtr.next = listNode;
                evenPtr = listNode;
            }else{
                oddPtr.next = listNode;
                oddPtr = listNode;
            }
            listNode = listNode.next;
        }
        evenPtr.next = odd.next;
        oddPtr.next=null;
        return even.next;
    }
}
