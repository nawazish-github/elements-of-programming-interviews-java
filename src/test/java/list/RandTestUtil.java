package list;

import list.util.RandListNode;

public class RandTestUtil {

    public static RandListNode<Integer> setUpRandLinkedList(){
        RandListNode<Integer> one = new RandListNode<>(1);
        RandListNode<Integer> two = new RandListNode<>(2);
        RandListNode<Integer> three = new RandListNode<>(3);
        RandListNode<Integer> four = new RandListNode<>(4);
        RandListNode<Integer> five = new RandListNode<>(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        one.rand = three;
        two.rand = one;
        three.rand = five;
        four.rand = five;
        five.rand = two;

        return one;
    }
}
