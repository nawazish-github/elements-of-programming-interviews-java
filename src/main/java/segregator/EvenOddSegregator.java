package segregator;

import list.util.ListNode;

public class EvenOddSegregator {
    public ResultWrapper segregateEvenOddLinkedList(ListNode listNode){
        int counter = 1;
        ListNode oddPtr = new ListNode();
        ListNode evenPtr = new ListNode();
        ListNode odd = oddPtr, even = evenPtr;

        while (listNode != null){
            if (counter%2 != 0){
                    oddPtr.next = listNode;
                    oddPtr = listNode;
                    listNode = listNode.next;

            }else{
                evenPtr.next = listNode;
                evenPtr = listNode;
                listNode = listNode.next;
            }
            counter++;
        }
        oddPtr.next=null;
        evenPtr.next=null;
        ResultWrapper wrapper = new ResultWrapper();
        wrapper.even = even.next;
        wrapper.odd = odd.next;
        return wrapper;
    }
}
