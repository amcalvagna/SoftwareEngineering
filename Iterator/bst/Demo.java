package bst; 

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        // IBinaryTree myEmptyTree = new NullTree();
        // Iterator<IBinaryTree> iterator = myEmptyTree.iterator();
        // System.out.println(iterator.next().key()); //exception here
        

        IBinaryTree myTree = new NullTree();
        System.out.println(myTree.containsKey(4));
        System.out.println(myTree.toString());

        myTree = myTree.insertKey(1); // give myTree a non null object
        myTree.insertKey(7);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(2);
        myTree.insertKey(6);
        myTree.insertKey(4);

        // myTree = myTree.insertKey(0); //transforms in a non null binary treex       
        // myTree.insertKey(1);
        // myTree.insertKey(2);
        // myTree.insertKey(3);
        // myTree.insertKey(4);
        // myTree.insertKey(5);
        // myTree.insertKey(6);
        // myTree.insertKey(7);
        // myTree.insertKey(8);

        if (myTree.containsKey(3))
            System.out.println("chiave 3 trovata.");
        else
            System.out.println("chiave 3 non trovata.");
        if (myTree.containsKey(8))
            System.out.println("chiave 8 trovata.");
        else
            System.out.println("chiave 8 non trovata.");

        System.out.println(myTree.toString());
    
        System.out.println("Visita in default order: "); // con enhanced for e default iterator
        for(IBinaryTree n: myTree) System.out.print(n.key() + " "); 
        System.out.println();
        
        Iterator<IBinaryTree> preOrderIterator = ((BinaryTree) myTree).preOrderBSTIterator();
        System.out.println("Visita pre-order: ");  // con uso esplicito dell'iteratore
        while(preOrderIterator.hasNext()) System.out.print(preOrderIterator.next().key() + " ");
        System.out.println();
        
        Iterator<IBinaryTree> postOrderIterator = ((BinaryTree) myTree).postOrderBSTIterator();
        System.out.println("Visita post-order: ");
        while(postOrderIterator.hasNext()) System.out.print(postOrderIterator.next().key() + " ");
        
        
        
        
    }
}