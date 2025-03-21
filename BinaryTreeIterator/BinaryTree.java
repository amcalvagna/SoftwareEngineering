import java.util.Iterator;

class BinaryTree implements IBinaryTree {
    private IBinaryTree left;  
    private IBinaryTree right;
    private int key;

    public BinaryTree(int key) {
        this.left= NullTree.getInstance();
        this.right= NullTree.getInstance();
        this.key = key;
    }


    public boolean containsKey(int key) {
        if (this.key == key) return true;
        
        if (this.key < key)
            return right.containsKey(key);
        else // (this.key > key)
            return left.containsKey(key);

    }

    public BinaryTree insertKey(int value) {
        if (value <= key) left = left.insertKey(value);
        else right = right.insertKey(value);
        return this;
    }

    public String toString() {
        return "(" + left.toString() + key + right.toString() + ")";
    }

    public boolean isNull(){ return false; }

    public IBinaryTree left() {
        return this.left;
    }

    public IBinaryTree right() {
        return this.right;
    }

    public int key() {
       return this.key;
    }

    public Iterator<IBinaryTree> iterator() { return new BinaryTreeIterator(this); }
}
