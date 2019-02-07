import list.overlapp_acyclic.FindOverlapInAcyclicLists;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOverlapinAcyclicLists {

    @Test
    public void testDetectOverlapAndTheOverlappingNode(){
        ListNode<Integer> list1 = TestListUtil.setupLinkedList(1,2,3,4,5);
        ListNode<Integer> list2 = TestListUtil.setupLinkedList(8,3,4,5);

        FindOverlapInAcyclicLists findOverlapInAcyclicLists = new FindOverlapInAcyclicLists();
        boolean isOverlapping = findOverlapInAcyclicLists.detectOverlap(list1, list2);

        Assertions.assertEquals(true, isOverlapping);

    }
}
