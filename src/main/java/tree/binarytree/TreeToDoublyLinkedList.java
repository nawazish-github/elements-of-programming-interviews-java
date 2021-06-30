package tree.binarytree;

import list.util.BinaryNode;


//left => backwards
//right => forwards

public class TreeToDoublyLinkedList {
    public BinaryNode<Integer> transform (BinaryNode<Integer> head){
        transformHelper(head);
        return headOfDLL;
    }

    static BinaryNode<Integer> headOfDLL, prevNode = null;
    private void transformHelper(BinaryNode<Integer> node){
        if (node == null){
            return;
        }
        transformHelper(node.left);
        if(prevNode == null){
            headOfDLL = node;
            //prevNode = node;
        }else{
            prevNode.right = node;
            node.left = prevNode;
            //prevNode = node;
        }
        prevNode = node;
        transformHelper(node.right);
    }
}
