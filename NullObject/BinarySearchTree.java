class BinarySearchTree {
    Node root;

    public boolean containsKey(int key) {
        return root.containsKey(key);
    }

    public String toString() {
        return "Tree:( " + root.toString() + ")";
    }

    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();

        Node left = new BinaryNode(new BinaryNode(new NullNode(), 1, "uno", new NullNode()), 2, "due",
                new BinaryNode(new NullNode(), 3, "tre", new NullNode()));
        Node right = new BinaryNode(new BinaryNode(new NullNode(), 5, "cinque", new NullNode()), 6, "sei",
                new BinaryNode(new NullNode(), 7, "sette", new NullNode()));

        myTree.root = new BinaryNode(left, 4, "quattro", right);

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