package queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Facundo | 95604 on 29/8/2016.
 * For FIUBA-TDD
 */
public class CompleteNodeTest {

    private static String testNumber_1 = "1";
    private static String testNumber_2 = "2";

    @Test
    public void testCorrectValue() throws Exception {
        CompleteNode<String> node = new CompleteNode<>(testNumber_1);
        assertEquals(testNumber_1, node.getElement());
    }

    @Test
    public void testCorrectCountSize() throws Exception {
        CompleteNode<String> node = new CompleteNode<>(testNumber_1);
        assertEquals(1, node.countSize());

        node.addNewElement(testNumber_2);
        assertEquals(2, node.countSize());

        node.addNewElement(testNumber_1);
        assertEquals(3, node.countSize());
    }

    @Test
    public void testNextNodeCorrectValue() throws Exception {
        CompleteNode<String> node = new CompleteNode<>(testNumber_1);
        node.addNewElement(testNumber_2);
        assertEquals(testNumber_2, node.getNextNode().getElement());
    }

}
