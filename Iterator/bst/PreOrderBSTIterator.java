package bst;

import java.util.Iterator;
import java.util.Stack;

public class PreOrderBSTIterator implements Iterator<IBinaryTree> {

	private IBinaryTree root;
	private Stack<IBinaryTree> stack;
	
	public PreOrderBSTIterator(IBinaryTree root) {
		this.root = root;
		stack = new Stack<IBinaryTree>();
		stack.push(this.root);
	}
	

	public IBinaryTree next() {
		IBinaryTree node = stack.pop();
        if (!node.right().isNull()) {
        	stack.push(node.right());
        }
        if(!node.left().isNull()) {
        	stack.push(node.left());
        }
        return node;
	}

	
	
	public boolean hasNext() {
		return !stack.isEmpty();
	}
}