package list;

import list.util.RandListNode;

import java.util.HashMap;

public class LinkedListCloner {
    private HashMap<RandListNode<Integer>, RandListNode<Integer>> map = new HashMap<>();
    public RandListNode clone (RandListNode head){
        RandListNode<Integer> currNode = head;
        while (currNode != null){
            map.put(currNode, new RandListNode<>(currNode.data));
            currNode = currNode.next;
        }
        currNode = head;
        while(currNode != null){
            RandListNode clone = map.get(currNode);
            clone.next = currNode.next;
            clone.rand = currNode.rand;
            currNode = currNode.next;
        }
        return map.get(head);
    }
}
