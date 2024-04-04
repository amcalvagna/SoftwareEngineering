class BinarySearchTree implements Node{
    Node root;

    public boolean containsKey(int key) {
        return root.containsKey(key);
    }

    public Node insertKey(int key) {
        if (root instanceof NullNode ) return root = new BinaryNode(key);  
        else return root.insertKey(key);
    }


    public BinarySearchTree() {
        root=new NullNode();
    }

    public String toString() {
        return "Tree:" + root.toString();
    }


}