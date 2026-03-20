package bst;

import java.util.Iterator;

public class NullTreeIterator implements Iterator<IBinaryTree> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public IBinaryTree next() {
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
