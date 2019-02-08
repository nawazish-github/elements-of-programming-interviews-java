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

    public ListNode<Integer> getOverlappingNode(ListNode<Integer> list1, ListNode<Integer> list2) {
        int lenList1 = FindOverlapInAcyclicLists.getLength(list1);
        int lenList2 = FindOverlapInAcyclicLists.getLength(list2);
        int diff = 0, c = 0;

        if(lenList1 > lenList2){
            diff = lenList1 - lenList2;
            while(c++ < diff){
                list1 = list1.next;
            }
        }else{
            diff = lenList2 - lenList1;
            while(c++ <= diff){
                list2 = list2.next;
            }
        }
        while(list1!=null && list2 != null){
            if (list1.next.data == list2.next.data){
                return list1.next;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        return null;
    }

    private static int getLength(ListNode<Integer> list) {
        int counter = 0;
        while(list!=null){
            list = list.next;
            ++counter;
        }
        return counter;
    }
}
