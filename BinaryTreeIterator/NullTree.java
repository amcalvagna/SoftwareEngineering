import java.util.Iterator;
import java.util.NoSuchElementException;

class NullTree implements IBinaryTree {
    
    static NullTree nn; 
    
    static NullTree getInstance(){
        if (nn==null) nn = new NullTree(); 
        return nn;
    }

    public boolean containsKey(int key) {
        return false;
    }

    public String toString() {
        return " ";
    }; 

    public BinaryTree insertKey(int key){
        return new BinaryTree(key);
    }

    public boolean isNull(){ return true; }

    public IBinaryTree left() {
        throw new NoSuchElementException("Null Trees have no 'left'");
    }

    public IBinaryTree right() {
        throw new NoSuchElementException("Null Trees have no 'right'");
    }

    public int key() {
        throw new NoSuchElementException("Null Trees have no 'key'");
    }

    public Iterator<IBinaryTree> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator()'");
    }

}