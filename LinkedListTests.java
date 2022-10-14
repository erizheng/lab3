import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend(){
        LinkedList input = new LinkedList();
        input.prepend(3);
        input.prepend(2);
        input.prepend(1);

        LinkedList result = new LinkedList();
        result.root = new Node(1, new Node(2, new Node(3, null)));

        assertEquals(result.toString(), input.toString());
    }

    @Test
    public void testAppend(){
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        input.append(3);

        LinkedList result = new LinkedList();
        result.root = new Node(1, new Node(2, new Node(3, null)));

        assertEquals(result.toString(), input.toString());
    }

    @Test
    public void testFirst(){
        LinkedList input = new LinkedList();
        input.root = new Node(1, new Node(2, new Node(3, null)));

        assertEquals(1, input.first());
    }

    @Test
    public void testLast(){
        LinkedList input = new LinkedList();
        input.root = new Node(1, new Node(2, new Node(3, null)));

        assertEquals(3, input.last());
    }

    @Test
    public void testLength(){
        LinkedList input = new LinkedList();
        input.root = new Node(1, new Node(2, new Node(3, new Node(4, null))));

        assertEquals(4, input.length());
    }
}
