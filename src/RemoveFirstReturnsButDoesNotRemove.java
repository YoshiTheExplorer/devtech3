/**
 * @author Sam Gunshor
 */
public class RemoveFirstReturnsButDoesNotRemove<E> extends DoublyLinkedList<E> {
    @Override
    public E removeFirst() {
        // Returns first value but leaves list unchanged.
        return super.getFirst();
    }
}
