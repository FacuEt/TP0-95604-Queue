package queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Facundo | 95604 on 29/8/2016.
 * For FIUBA-TDD
 */
public class NullNodeTest {

    @Test
    public void getElement() throws Exception {
        NullNode<String> node = new NullNode<>();
        boolean exception = false;

        try {
            node.getElement();
        } catch (AssertionError e) {
            if (e.getMessage().equals(NullNode.ERROR_EMPTY_NODE)) {
                exception = true;
            }
        }

        assertTrue(exception);
    }

    @Test
    public void addNewElement() throws Exception {
        NullNode<String> node = new NullNode<>();
        String stringTest = "Test NullNode";

        Node newNode = node.addNewElement(stringTest);
        assertEquals(newNode.getElement(), stringTest);
    }

    @Test
    public void getNextNode() throws Exception {
        NullNode<String> node = new NullNode<>();
        boolean exception = false;

        try {
            node.getNextNode();
        } catch (AssertionError e) {
            if (e.getMessage().equals(NullNode.ERROR_EMPTY_NODE)) {
                exception = true;
            }
        }

        assertTrue(exception);
    }

    @Test
    public void countSize() throws Exception {
        NullNode<String> node = new NullNode<>();
        assertEquals(node.countSize(),0);
    }

}