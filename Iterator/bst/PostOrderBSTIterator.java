package bst;

import java.util.Iterator;
import java.util.Stack;

public class PostOrderBSTIterator implements Iterator<IBinaryTree> {

	private IBinaryTree root;
	private Stack<IBinaryTree> stack;
	
	public PostOrderBSTIterator(IBinaryTree root) {
		this.root = root;
		stack = new Stack<IBinaryTree>();
		pushNodes(this.root);
	}
	

	public IBinaryTree next() {
		IBinaryTree node = stack.pop();
	    if (!stack.isEmpty()) {
	    	IBinaryTree stackPeek = stack.peek();
	        if (node == stackPeek.left()) {
	            pushNodes(stackPeek.right());
	        }
	    }
	    return node;
	}

	
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	private void pushNodes(IBinaryTree node) {
		while(!node.isNull()) {
			stack.push(node);
			
			if(!node.left().isNull()) {
				node = node.left();
			}
			else {
				node = node.right();
			}
		}
	}
}