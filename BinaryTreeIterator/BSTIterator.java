import java.util.Iterator;
import java.util.Stack;

class BSTIterator implements Iterator<Node>{
   /*  private Node root;
    private Node curNode;
    private int curStage;
    private Stack<Node> nodes;
    private Stack<Integer> stages;
*/
    public Node root;
    public Node curNode;
    public int curStage;
    public Stack<Node> nodes;
    public Stack<Integer> stages;


    public BSTIterator(BinarySearchTree bst) {
        root = bst.root;
        nodes = new Stack<Node>();
        stages = new Stack<Integer>();
        curNode = root; 
        curStage = 0;         
    }

    @Override
    public boolean hasNext() { 
        if ((curNode instanceof NullNode)) return false; //empty tree?
        Node right = ((BinaryNode) curNode).right; 
        if(curStage!=0 && right instanceof NullNode && !stages.contains(1))  return false; 
        return true;

    }
       

    @Override
    public Node next() {
        
        if ((curNode instanceof NullNode) || (curStage==3)){ //empty leaf or node done?
            // go up
            curNode = nodes.pop();
            curStage = stages.pop();
            return next();
        }
        //advance current node processing step     
        switch(curStage) {
            //go down left
            case 0: nodes.push(curNode); stages.push(curStage+1); 
                    curNode = ((BinaryNode) curNode).left; curStage=0;
                    return next();
            //return this        
            case 1: curStage++; return curNode; 
            //go down right
            case 2: nodes.push(curNode); stages.push(curStage+1); 
                    curNode = ((BinaryNode) curNode).right; curStage=0;
                    return next();
         }          
         return curNode; // actually, never goes here                   
    }

    
}
