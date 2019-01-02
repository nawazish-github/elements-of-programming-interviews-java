import list.reversal.ListReversal;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestListReversal {

    @Test
    public void testListReversal(){
        ListNode listNode = TestListUtil.setupLinkedList(1,3,5,7,8,10);
        ListNode expected = TestListUtil.setupLinkedList(10,8,7,5,3,1);

        ListReversal listReversal = new ListReversal();
        ListNode actual = listReversal.reverseList(listNode);

        while (actual != null && expected !=null){
            Assertions.assertEquals(actual.data, expected.data);
            actual= actual.next;
            expected=expected.next;
        }

        Assertions.assertEquals(actual, expected);
    }
}
