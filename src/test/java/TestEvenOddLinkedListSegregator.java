import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import segregator.EvenOddSegregator;
import segregator.ResultWrapper;

public class TestEvenOddLinkedListSegregator {

    @Test
    public void segregateEvenOddLinkedList(){
        ListNode list = TestListUtil.setupLinkedList(1,2,3,4,5);
        ListNode odd = TestListUtil.setupLinkedList(1,3,5);
        ListNode even = TestListUtil.setupLinkedList(2,4);

        EvenOddSegregator evenOddSegregator = new EvenOddSegregator();
        ResultWrapper resultWrapper = evenOddSegregator.segregateEvenOddLinkedList(list);

        TestListUtil.assertLinkedLists(resultWrapper.odd, odd);
        TestListUtil.assertLinkedLists(resultWrapper.even, even);
    }
}
