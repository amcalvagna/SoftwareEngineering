public class TestD {
    public static void main(String[] args) {
        IBinaryTree myTree = NullTree.getInstance();

        System.out.println(myTree.containsKey(4));
        System.out.println(myTree.toString());
        
        myTree = myTree.insertKey(0); //transforms in a non null binary tree
        
        myTree.insertKey(1);
        myTree.insertKey(7);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(2);
        myTree.insertKey(8);
        myTree.insertKey(6);
        myTree.insertKey(4);

        System.out.println(myTree.toString());

        debugIterator( (BinaryTree) myTree);

        myTree = new BinaryTree(0);
        
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
       
        debugIterator( (BinaryTree) myTree);
        
        if (myTree.containsKey(3))
            System.out.println("chiave 3 trovata.");
        else
            System.out.println("chiave 3 non trovata.");
        if (myTree.containsKey(8))
            System.out.println("chiave 8 trovata.");
        else
            System.out.println("chiave 8 non trovata.");
    }

    static void debugIterator(IBinaryTree Tree) {
        for (BinaryTreeIterator i = (BinaryTreeIterator) Tree.iterator(); i.hasNext();) {
            IBinaryTree n = i.next();
            System.out.print(i.curNode.key() + " ");
            System.out.print(i.curStage + " [");
            for (Object x : i.nodes.toArray()) System.out.print(((IBinaryTree) x).key() + " ");
            System.out.print("]" + i.stages.toString() + " ");

            System.out.println(n.key());
        }

    }
    
}
