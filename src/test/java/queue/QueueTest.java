package queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facundo | 95604 on 29/8/2016.
 * For FIUBA-TDD
 */
public class QueueTest {

    private static String STRING_TEST = "TEST QUEUE";

    @Test
    public void isEmpty() throws Exception {
        Queue<String> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void add() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.add(STRING_TEST);

        assertEquals(queue.top(),STRING_TEST);
    }

    @Test
    public void size() throws Exception {
        Queue<String> queue = new Queue<>();
        assertEquals(queue.size(),0);

        queue.add(STRING_TEST);
        assertEquals(queue.size(),1);

        queue.add(STRING_TEST);
        assertEquals(queue.size(),2);
    }

    @Test
    public void top() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.add(STRING_TEST);
        queue.add("OTRO TEST");
        queue.add("OTRO TEST 2");

        assertEquals(queue.top(),STRING_TEST);
    }

    @Test
    public void remove() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.add("OTRO TEST");
        queue.add(STRING_TEST);
        queue.remove();

        assertEquals(queue.top(),STRING_TEST);
    }

}
