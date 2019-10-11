package recursion;

import list.util.RandListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpFirstOrderingTest {

    @Test
    public void jumpFirstOrderTest1(){
        RandListNode<Integer> c = null;
        RandListNode<Integer> d = new RandListNode<>(-1, null, null);
        RandListNode<Integer> b = new RandListNode<>(-1, c, d);
        c = new RandListNode<>(-1, d, b);
        b = new RandListNode<>(-1, c, d);
        RandListNode<Integer> a = new RandListNode<>(-1, b, b);
        JumpFirstOrdering jumpFirstOrdering = new JumpFirstOrdering();
        RandListNode<Integer> head = jumpFirstOrdering.jumpFirstOrder(a);
        //Assertions.assertEquals(null, null);

    }
}
