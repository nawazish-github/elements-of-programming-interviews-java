package list;

import list.util.RandListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListClonerTest {

    @Test
    public void cloneTest() {
        RandListNode<Integer> randListNode = RandTestUtil.setUpRandLinkedList();
        LinkedListCloner linkedListCloner = new LinkedListCloner();
        RandListNode<Integer> clone = linkedListCloner.clone(randListNode);

        int counter = 0;
        while(clone != null){
            counter+=1;
            switch (clone.data){
                case 1:
                    Assertions.assertEquals(2, clone.next.data);
                    Assertions.assertEquals(3, clone.rand.data);
                    break;
                case 2:
                    Assertions.assertEquals(3, clone.next.data);
                    Assertions.assertEquals(1, clone.rand.data);
                    break;
                case 3:
                    Assertions.assertEquals(4, clone.next.data);
                    Assertions.assertEquals(5, clone.rand.data);
                    break;
                case 4:
                    Assertions.assertEquals(5, clone.next.data);
                    Assertions.assertEquals(5, clone.rand.data);
                    break;
                case 5:
                    Assertions.assertEquals(null, clone.next);
                    Assertions.assertEquals(2, clone.rand.data);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + clone.data);
            }
            clone = clone.next;
        }
        Assertions.assertEquals(5, counter);
    }


}
