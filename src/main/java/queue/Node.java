package queue;

/**
 * Created by Facundo | 95604 on 28/8/2016.
 * For FIUBA-TDD
 */
interface Node<T> {
    T getElement() throws AssertionError;

    Node<T> getNextNode() throws AssertionError;

    Node<T> addNewElement(T item);

    int countSize();

    boolean isEmpty();

}
