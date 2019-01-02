package list.merge;

import list.util.ListNode;

public class ListMerger {
    public ListNode<Integer> merge(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> result = new ListNode<Integer>();
        ListNode<Integer> pointer = result;
        while (l1 != null && l2 != null){
            if(l1.data<=l2.data){
                pointer.next = l1;
                pointer = l1;
                l1 = l1.next;
            }else{
                pointer.next = l1;
                pointer = l1;
                l1 = l1.next;
            }
        }

        if (l1!=null){
            pointer.next = l1;
        }else{
            pointer.next = l2;
        }

        return result.next;
    }

    public ListNode<Integer> efficientMerger (ListNode<Integer>l1,
                                              ListNode<Integer>l2){
        ListNode<Integer> ptr = new ListNode<Integer>();
        ListNode<Integer> head = ptr;
        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                ptr.next = l1;
                ptr = l1;
                l1 = l1.next;
            }else{
                ptr.next = l2;
                ptr = l2;
                l2 = l2.next;
            }
        }

        if(l1 != null){
            ptr.next=l1;
        }else{
            ptr.next=l2;
        }
        return head.next;
    }
}


