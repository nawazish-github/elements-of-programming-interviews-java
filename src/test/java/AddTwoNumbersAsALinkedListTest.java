import list.AddTwoNumbersAsALinkedList;
import list.util.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersAsALinkedListTest {

    @Test
    public void addTwoNumbersAsLinkedListTest (){
        AddTwoNumbersAsALinkedList addTwoNumbersAsALinkedList = new AddTwoNumbersAsALinkedList();
        ListNode<Integer> list1 = TestListUtil.setupLinkedList(2, 4, 3);
        ListNode<Integer> list2 = TestListUtil.setupLinkedList(5,6,4);
        ListNode<Integer> listNode = addTwoNumbersAsALinkedList.addTwoNumbersAsLinkedList(list1, list2);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(7,0,8);
        TestListUtil.assertLinkedLists(expected, listNode);
    }


    @Test
    public void addTwoNumbersAsLinkedListTest2 (){
        AddTwoNumbersAsALinkedList addTwoNumbersAsALinkedList = new AddTwoNumbersAsALinkedList();
        ListNode<Integer> list1 = TestListUtil.setupLinkedList(0, 7);
        ListNode<Integer> list2 = TestListUtil.setupLinkedList(0);
        ListNode<Integer> listNode = addTwoNumbersAsALinkedList.addTwoNumbersAsLinkedList(list1, list2);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(0, 7);
        TestListUtil.assertLinkedLists(expected, listNode);
    }
}
