package list.overlapp_acyclic;

import list.util.ListNode;

public class FindOverlapInAcyclicLists {
    public boolean detectOverlap(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> lastNodeOfList1 = null, lastNodeOfList2 = null;

        while(list1!=null){
            lastNodeOfList1 = list1;
            list1 = list1.next;
        }

        while(list2!=null){
            lastNodeOfList2 = list2;
            list2 = list2.next;
        }

        if (lastNodeOfList1.data == lastNodeOfList2.data){
            return true;
        }
        return false;
    }
}
