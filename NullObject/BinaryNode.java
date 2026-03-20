class BinaryNode implements Node {
    Node left;
    Node right;
    int key;
    String value;

    public boolean containsKey(int key) {
        if (this.key == key)
            return true;
        if (this.key < key)
            return right.containsKey(key);
        else // (this.key > key)
            return left.containsKey(key);

    }

    public String toString() {
        return "( " + left.toString() + value + right.toString() + ")";
    }

    public BinaryNode(Node left, int key, String value, Node right) {
        this.left = left;
        this.right = right;
        this.key = key;
        this.value = value;
    }

}
