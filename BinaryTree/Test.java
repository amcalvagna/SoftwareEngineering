public class Test {
    public static void main(String[] args) {
        Node myTree = new BinarySearchTree();

        System.out.println(myTree.containsKey(4));
        System.out.println(myTree.toString());

        myTree.insertKey(1);
        myTree.insertKey(7);
        myTree.insertKey(3);
        myTree.insertKey(5);
        myTree.insertKey(2);
        myTree.insertKey(6);
        myTree.insertKey(4);

        if (myTree.containsKey(3))
            System.out.println("chiave 3 trovata.");
        else
            System.out.println("chiave 3 non trovata.");
        if (myTree.containsKey(8))
            System.out.println("chiave 8 trovata.");
        else
            System.out.println("chiave 8 non trovata.");

        System.out.println(myTree.toString());

    }
}
