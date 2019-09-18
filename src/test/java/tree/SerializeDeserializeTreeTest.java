package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SerializeDeserializeTreeTest {

    @Test
    public void serializeTest (){
        TreeNode<Character> root = getTreeNode();
        SerializeDeserializeTree serializeDeserializeTree = new SerializeDeserializeTree();
        ArrayList<Character> serialize = serializeDeserializeTree.serialize(root);
        Assertions.assertArrayEquals(new Object[]{'1', '2', null, null, '3', '4', null, null, '5', null, null},
                serialize.toArray());
    }

    @Test
    public void deserializeTest(){
        ArrayList<Character> arrayList = new ArrayList<>();
            arrayList.add('1');
            arrayList.add('2');
            arrayList.add(null);
            arrayList.add(null);
            arrayList.add('3');
            arrayList.add('4');
            arrayList.add(null);
            arrayList.add(null);
            arrayList.add('5');
            arrayList.add(null);
            arrayList.add(null);
        SerializeDeserializeTree serializeDeserializeTree = new SerializeDeserializeTree();
        TreeNode<Character> deserialize = serializeDeserializeTree.deserialize(arrayList);
        System.out.println(deserialize);
    }

    private TreeNode<Character> getTreeNode() {
        TreeNode root = new TreeNode('1');
            root.left = new TreeNode('2');
            root.right = new TreeNode('3');
            root.right.left = new TreeNode('4');
            root.right.right = new TreeNode('5');
        return root;
    }
}



