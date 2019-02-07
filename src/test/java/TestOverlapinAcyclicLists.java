import list.overlapp_acyclic.FindOverlapInAcyclicLists;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOverlapinAcyclicLists {

    @Test
    public void testDetectOverlapAndTheOverlappingNode(){
        FindOverlapInAcyclicLists findOverlapInAcyclicLists = new FindOverlapInAcyclicLists();

        ListNode<Integer> list1 = TestListUtil.setupLinkedList(1,2,3,4,5);
        ListNode<Integer> list2 = TestListUtil.setupLinkedList(8,3,4,5);
        boolean isOverlapping = findOverlapInAcyclicLists.detectOverlap(list1, list2);
        Assertions.assertEquals(true, isOverlapping);

        list1 = TestListUtil.setupLinkedList(1,2,3,4,5);
        list2 = TestListUtil.setupLinkedList(8,3,4,5);
        ListNode<Integer>overLappingNode = findOverlapInAcyclicLists.getOverlappingNode(list1,list2);
        Assertions.assertEquals(3, overLappingNode.data);

        list1 = TestListUtil.setupLinkedList(1,2,3,4,5);
        list2 = TestListUtil.setupLinkedList(8,9,10);
        isOverlapping = findOverlapInAcyclicLists.detectOverlap(list1, list2);
        Assertions.assertEquals(false, isOverlapping);
    }

}
