package recursion;

import list.util.RandListNode;

public class JumpFirstOrdering {
    public RandListNode<Integer> jumpFirstOrder(RandListNode<Integer> head){
        Integer order = 0;
        //jumpFirstOrder(head, order);
        jumpFirstOrderHelper(head);
        return head;
    }


    private void jumpFirstOrder (RandListNode<Integer> node, Integer currOrder){
        if(node == null) return;
        if(node.data != -1) return;

        node.data = currOrder;
        //currOrder = currOrder + 1;
        currOrder++;

        jumpFirstOrder(node.rand, currOrder);
        jumpFirstOrder(node.next, currOrder);
    }

    int currOrder = 0;
    private void jumpFirstOrderHelper(RandListNode<Integer> node){
        if(node == null) return;
        if(node.data != -1) return;

        node.data = currOrder;
        currOrder = currOrder + 1;

        jumpFirstOrder(node.rand);
        jumpFirstOrder(node.next);

    }
}
