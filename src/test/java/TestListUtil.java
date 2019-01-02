import list.util.ListNode;

public class TestListUtil {
    public static ListNode<Integer> setupLinkedList(int...nums) {
        ListNode<Integer> head = new ListNode<Integer>();
        ListNode<Integer> tail = head;

        for (int i=0;i<nums.length; i++){
            ListNode l = new ListNode<Integer>();
            l.data=nums[i];
            tail.next=l;
            tail = l;
        }
        return head.next;
    }
}
