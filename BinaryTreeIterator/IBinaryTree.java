public interface IBinaryTree extends Iterable<IBinaryTree>{
    
    boolean containsKey(int key);

    String toString();

    IBinaryTree insertKey(int key);

    boolean isNull();

    IBinaryTree left();

    IBinaryTree right();

    int key();

}
