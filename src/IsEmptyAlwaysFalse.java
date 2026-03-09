/**
 * @author Sam Gunshor
 */
public class IsEmptyAlwaysFalse<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        // Incorrectly reports non-empty even when size is 0.
        return false;
    }
}
