package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeTree {

    public ArrayList<Character>  serialize (TreeNode<Character> node) {
        return serializeHelper(node, new ArrayList<Character>());
    }

    public TreeNode<Character> deserialize (ArrayList<Character> arrayList){
        Queue<Character> queue = new LinkedList<>(arrayList);
        return deserializeHelper(queue);
    }

    private TreeNode<Character> deserializeHelper(Queue<Character> queue) {
        Character character = queue.remove();
        if (character==null){
            return null;
        }
        TreeNode treeNode = new TreeNode(character);
        treeNode.left = deserializeHelper(queue);
        treeNode.right = deserializeHelper(queue);
        return treeNode;
    }

    private ArrayList<Character>  serializeHelper(TreeNode<Character> node, ArrayList<Character> arrayList) {
        if(node == null){
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(node.value);
        serializeHelper(node.left, arrayList);
        serializeHelper(node.right, arrayList);
        return arrayList;
    }
}
