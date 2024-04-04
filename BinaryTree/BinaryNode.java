class BinaryNode implements Node {
    Node left;
    Node right;
    int key;

    public boolean containsKey(int key) {
        if (this.key == key)
            return true;
        if (this.key < key)
            return right.containsKey(key);
        else // (this.key > key)
            return left.containsKey(key);

    }

    public Node insertKey(int value) {
        if (value <= key) left = left.insertKey(value);
        else right = right.insertKey(value);

        return this;
    }

    public String toString() {
        return "(" + left.toString() + key + right.toString() + ")";
    }

    public BinaryNode(int key) {
        this.left= new NullNode();
        this.right= new NullNode();
        this.key = key;
    }

}
