import java.util.Iterator;

public class TestD {
    public static void main(String[] args) {
        Node myTree = new BinarySearchTree();

        System.out.println(myTree.containsKey(4));
        System.out.println(myTree.toString());
 
        myTree.insertKey(1);
        myTree.insertKey(7);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(2);
        myTree.insertKey(8);
        myTree.insertKey(6);
        myTree.insertKey(4);

        System.out.println(myTree.toString());

        for (Iterator<Node> i = ((BinarySearchTree) myTree).iterator(); i.hasNext();) {
            Node n = i.next();
            System.out.print(((BinaryNode) ((BSTIterator) i).curNode).key + " ");
            System.out.print(((BSTIterator) i).curStage + " [");
            for (Object x : ((BSTIterator) i).nodes.toArray()) System.out.print(((BinaryNode) x).key + " ");
            System.out.print("]" + ((BSTIterator) i).stages.toString() + " ");

            System.out.println(((BinaryNode) n).key);
        }

        myTree = new BinarySearchTree();
        
        myTree.insertKey(4);
        myTree.insertKey(7);
        myTree.insertKey(2);
        myTree.insertKey(1);
        myTree.insertKey(3);
        myTree.insertKey(8);
        myTree.insertKey(5);
        myTree.insertKey(6);

        if (myTree.containsKey(3))
            System.out.println("chiave 3 trovata.");
        else
            System.out.println("chiave 3 non trovata.");
        if (myTree.containsKey(8))
            System.out.println("chiave 8 trovata.");
        else
            System.out.println("chiave 8 non trovata.");

        System.out.println(myTree.toString());
       
         
        for (Iterator<Node> i = ((BinarySearchTree) myTree).iterator(); i.hasNext();) { 
            Node n = i.next(); 
            System.out.print(((BinaryNode) ((BSTIterator) i).curNode).key + " " );
            System.out.print (((BSTIterator) i).curStage + " [");
            for(Object x: ((BSTIterator) i).nodes.toArray()) System.out.print(((BinaryNode)x).key + " ");
            System.out.print ("]"+ ((BSTIterator) i).stages.toString()+ " ");

            System.out.println(((BinaryNode) n).key); 
        }
        if (myTree.containsKey(3))
            System.out.println("chiave 3 trovata.");
        else
            System.out.println("chiave 3 non trovata.");
        if (myTree.containsKey(8))
            System.out.println("chiave 8 trovata.");
        else
            System.out.println("chiave 8 non trovata.");
    }
    
}
