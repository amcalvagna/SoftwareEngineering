import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // test setup for NullTree
        IBinaryTree myTree = NullTree.getInstance();
        
        //test #1 contains
        System.out.println(myTree.containsKey(0));

        //test #1 toString
        System.out.println(myTree.toString());
 
        //test #3 insertKey
        myTree = myTree.insertKey(0);
        System.out.println(myTree.containsKey(0));
        System.out.println(myTree.toString());

        //test #4 iterator
        myTree.insertKey(1);
        myTree.insertKey(7);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(2);
        myTree.insertKey(8);
        myTree.insertKey(6);
        myTree.insertKey(4);
       
        System.out.println(myTree.toString());
        // uso implicito dell'iteratore
        for (IBinaryTree n: myTree) System.out.println(n.key());        
        
        // uso implicito e completo: a println passo next()  
        myTree.forEach(System.out::println);

        // test #1bis contains()
        if (myTree.containsKey(8))
        System.out.println("chiave rovata.");
        else
        System.out.println("chiave non trovata.");

        // reset-up test for BinaryTree
        // manca un metodo clear? 
        myTree = new BinaryTree(8);
        
        myTree.insertKey(8);
        myTree.insertKey(4);
        myTree.insertKey(7);
        myTree.insertKey(2);
        myTree.insertKey(1);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(6);

        System.out.println(myTree.toString());
        
        for (Iterator<IBinaryTree> i = myTree.iterator(); i.hasNext();) System.out.print(i.next().key() + " ");

        if (myTree.containsKey(11))
            System.out.println("\nchiave trovata.");
        else
            System.out.println("\nchiave non trovata.");
        

       
         
       
    }
}
