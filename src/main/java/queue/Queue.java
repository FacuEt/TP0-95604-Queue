package queue;

/**
 * Created by Facundo | 95604 on 28/8/2016.
 * For FIUBA-TDD
 */
class Queue<T> {

    private Node<T> topNode;

    Queue() {
        topNode = new NullNode<>();
    }

    Queue(T item) {
        topNode = new CompleteNode<>(item);
    }

    boolean isEmpty() {
        return topNode.isEmpty();
    }

    int size() {
        return topNode.countSize();
    }

    void add(T item) {
        topNode = topNode.addNewElement(item);
    }

    // retornar el primer item, lanzar exception si esta vacío.
    T top() throws AssertionError {
        return topNode.getElement();
    }

    // remover el primer item lanzar exception si esta vacío.
    void remove() throws AssertionError {
        topNode = topNode.getNextNode();
    }
}
