package queue;

/**
 * Created by Facundo | 95604 on 28/8/2016.
 * For FIUBA-TDD
 */
class NullNode<T> implements Node<T> {

    NullNode() {}

    static String ERROR_EMPTY_NODE = "Error, empty.";

    public T getElement() throws AssertionError {
        throw new AssertionError(ERROR_EMPTY_NODE);
    }

    public Node<T> addNewElement(T item) {
        return new CompleteNode<>(item);
    }

    public Node<T> getNextNode() throws AssertionError {
        throw new AssertionError(ERROR_EMPTY_NODE);
    }

    public int countSize() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }
}
