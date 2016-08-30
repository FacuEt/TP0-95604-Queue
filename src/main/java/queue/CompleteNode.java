package queue;

/**
 * Created by Facundo | 95604 on 29/8/2016.
 * For FIUBA-TDD
 */
class CompleteNode<T> implements Node<T> {

    private T element;
    private Node<T> nextNode = new NullNode<>();

    CompleteNode(T item) {
        element = item;
    }

    public T getElement() throws AssertionError {
        return element;
    }

    public Node<T> getNextNode() throws AssertionError {
        return nextNode;
    }

    @Override
    public Node<T> addNewElement(T item) {
        nextNode = nextNode.addNewElement(item);
        return this;
    }

    public int countSize() {
        return 1 + nextNode.countSize();
    }

    public boolean isEmpty() {
        return false;
    }

}
