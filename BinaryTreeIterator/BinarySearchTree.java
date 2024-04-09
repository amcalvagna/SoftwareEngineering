import java.util.Iterator;

public class BinarySearchTree implements Node,  Iterable<Node>{
    Node root;

    public boolean containsKey(int key) { return root.containsKey(key);}

    public Node insertKey(int key) {
        if (root instanceof NullNode ) return root = new BinaryNode(key);  
        else return root.insertKey(key);
    }

    public BinarySearchTree() { root = NullNode.getInstance(); }

    public String toString() { return "Tree:" + root.toString();}


    public Iterator<Node> iterator() { return new BSTIterator(this); }

}