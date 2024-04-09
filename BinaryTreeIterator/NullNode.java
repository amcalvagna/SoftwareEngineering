class NullNode implements Node {
    static NullNode nn; 
    public boolean containsKey(int key) {
        return false;
    }

    public String toString() {
        return " ";
    }

    public Node insertKey(int key){
        return new BinaryNode(key);
    }; 

    static Node getInstance(){
        if (nn==null) nn = new NullNode(); 
        return nn;
    }


}