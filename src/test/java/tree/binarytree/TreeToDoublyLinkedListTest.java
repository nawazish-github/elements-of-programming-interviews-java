package tree.binarytree;

import list.util.BinaryNode;

public class TreeToDoublyLinkedListTest {

    //@Test
    //@Ignore
    public void test1(){
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> one = new BinaryNode<>(1, two, three);
        TreeToDoublyLinkedList treeToDoublyLinkedList = new TreeToDoublyLinkedList();
        BinaryNode<Integer> dll = treeToDoublyLinkedList.transform(one);
        System.out.println(dll);
    }
}
