import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author Sam Gunshor
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Sam Gunshor
     * @see GetBroken
     */
    @Test
    public void testGetAtIndex() {
        if (SHOULD_FAIL) list = new GetBroken<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    // Tests for getFirst

    /**
     * @author Sam Gunshor
     * @see GetFirstBroken
     */
    @Test
    public void testGetFirstReturnsHeadElement() {
        if (SHOULD_FAIL) list = new GetFirstBroken<>();

        list.addLast(5);
        list.addLast(15);
        list.addLast(25);

        assertEquals(5, list.getFirst());
    }

    // Tests for getLast

    /**
     * @author Sam Gunshor
     * @see GetLastBroken
     */
    @Test
    public void testGetLastReturnsTailElement() {
        if (SHOULD_FAIL) list = new GetLastBroken<>();

        list.addLast(5);
        list.addLast(15);
        list.addLast(25);

        assertEquals(25, list.getLast());
    }

    // Tests for isEmpty

    /**
     * @author Colin Yamada
     * @see IsEmptyAlwaysFalse
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new IsEmptyAlwaysFalse<>();

        assertTrue(list.isEmpty());
    }

    // Tests for add

    /**
     * @author Sam Gunshor
     * @see AddIntBroken
     */
    @Test
    public void testAddAtIndexInsertsAtCorrectPosition() {
        if (SHOULD_FAIL) list = new AddIntBroken<>();

        list.addLast(1);
        list.addLast(3);
        list.add(1, 2);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    // Tests for addFirst

    /**
     * @author Sam Gunshor
     * @see AddFirstBroken
     */
    @Test
    public void testAddFirstAddsElement() {
        if (SHOULD_FAIL) list = new AddFirstBroken<>();

        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);

        assertEquals(1, list.getFirst());
        assertEquals(3, list.getLast());
        assertEquals(3, list.size());
    }

    // Tests for addLast

    /**
     * @author Sam Gunshor
     * @see AddLastBroken
     */
    @Test
    public void testAddLastAddsElement() {
        if (SHOULD_FAIL) list = new AddLastBroken<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(1, list.getFirst());
        assertEquals(3, list.getLast());
        assertEquals(3, list.size());
    }

    // Tests for remove

    /**
     * @author Colin Yamada
     * @see RemoveAtIndexAlwaysRemovesLast
     */
    @Test
    public void testRemoveAtIndex() {
        if (SHOULD_FAIL) list = new RemoveAtIndexAlwaysRemovesLast<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(20, list.remove(1));
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(1));
    }

    // Tests for removeFirst

    /**
     * @author Colin Yamada
     * @see RemoveFirstReturnsButDoesNotRemove
     */
    @Test
    public void testRemoveFirstRemovesHead() {
        if (SHOULD_FAIL) list = new RemoveFirstReturnsButDoesNotRemove<>();

        list.addLast(7);
        list.addLast(8);

        assertEquals(7, list.removeFirst());
        assertEquals(1, list.size());
        assertEquals(8, list.getFirst());
    }

    // Tests for removeLast

    /**
     * @author Colin Yamada
     * @see RemoveLastReturnsButDoesNotRemove
     */
    @Test
    public void testRemoveLastRemovesTail() {
        if (SHOULD_FAIL) list = new RemoveLastReturnsButDoesNotRemove<>();

        list.addLast(7);
        list.addLast(8);

        assertEquals(8, list.removeLast());
        assertEquals(1, list.size());
        assertEquals(7, list.getLast());
    }

    // Tests for size

    /**
     * @author Colin Yamada
     * @see SizeAlwaysZero
     */
    @Test
    public void testSizeTracksMutations() {
        if (SHOULD_FAIL) list = new SizeAlwaysZero<>();

        assertEquals(0, list.size());
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.size());
        list.removeFirst();
        assertEquals(1, list.size());
    }

    // Tests for set

    /**
     * @author Colin Yamada
     * @see SetReturnsNewValueInsteadOfOld
     */
    @Test
    public void testSetReplacesElementAndReturnsOldValue() {
        if (SHOULD_FAIL) list = new SetReturnsNewValueInsteadOfOld<>();

        list.addLast(11);
        list.addLast(22);

        assertEquals(22, list.set(1, 99));
        assertEquals(99, list.get(1));
    }

}