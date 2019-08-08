package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreathFirstSearch {
   static class Node {
       String name;
       ArrayList<Node> children = new ArrayList<Node>();

       public Node(String name) {
           this.name = name;
       }

       public ArrayList<String> breadthFirstSearch(ArrayList<String> array) {
           // Write your code here.
           LinkedList<Node> queue = new LinkedList<>();
           array.add(this.name);
           if (this.children != null)
               for (Node node : this.children) {
                   queue.addLast(node);
               }
           while (queue.size() > 0) {
               Node node = queue.removeFirst();
               array.add(node.name);
               if (node.children != null) {
                   for (Node n : node.children) {
                       queue.addLast(n);
                   }
               }
           }
           return array;
       }

       public Node addChild(String name) {
           Node child = new Node(name);
           children.add(child);
           return this;
       }
   }
}

