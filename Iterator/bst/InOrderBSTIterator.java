package bst;

import java.util.Iterator;
import java.util.Stack;

public class InOrderBSTIterator implements Iterator<IBinaryTree> {

	private IBinaryTree root;
	private Stack<IBinaryTree> stack;
	
	public InOrderBSTIterator(IBinaryTree root) {
		this.root = root;
		stack = new Stack<IBinaryTree>();
		pushLeftNodes(this.root);
	}
	

	public IBinaryTree next() {
		IBinaryTree node = stack.pop();
        if (!node.right().isNull()) {
            pushLeftNodes(node.right());
        }
        return node;
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	private void pushLeftNodes(IBinaryTree node) {
		while(!node.isNull()) {
			stack.push(node);
			node = node.left();
		}
	}
}