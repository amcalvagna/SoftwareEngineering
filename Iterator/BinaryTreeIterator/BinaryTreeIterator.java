import java.util.Iterator;
import java.util.Stack;

class BinaryTreeIterator implements Iterator<IBinaryTree>{
  
    public BinaryTree root;
    public IBinaryTree curNode;
    public int curStage;
    public Stack<IBinaryTree> nodes;
    public Stack<Integer> stages;


    public BinaryTreeIterator(BinaryTree bst) {
        root = bst; 
        nodes = new Stack<IBinaryTree>();
        stages = new Stack<Integer>();
        curNode = root; 
        curStage = 0;         
    }

    @Override
    public boolean hasNext() { 
        if (curNode.isNull()) return false; //empty tree?
        if(curStage!=0 && curNode.right().isNull() && !stages.contains(1))  return false; 
        return true;

    }
       

    @Override
    public BinaryTree next() {
        
        if ((curNode.isNull()) || (curStage==3)){ //empty leaf or node done?
            // go up
            curNode = nodes.pop();
            curStage = stages.pop();
            return next();
        }
        //advance current node processing step     
        switch(curStage) {
            //go down left
            case 0: nodes.push(curNode); stages.push(curStage+1); 
                    curNode =  curNode.left(); curStage=0;
                    return next();
            //return this 
            //qui il cast è safe anche a runtime perchè qui curNode è un BinaryTree       
            case 1: curStage++; return (BinaryTree) curNode;  
            //go down right
            case 2: nodes.push(curNode); stages.push(curStage+1); 
                    curNode = curNode.right(); curStage=0;
                    return next();
         }          
         return (BinaryTree) curNode; // actually, never goes here                   
    }

    
}
