class NullNode implements Node {
    public boolean containsKey(int key) {
        return false;
    }

    public String toString() {
        return " ";
    }

    public Node insertKey(int key){
        return new BinaryNode(key);
    }; 

    boolean isNull(){return true;}

}