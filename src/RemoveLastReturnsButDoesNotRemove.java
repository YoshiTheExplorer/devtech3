/**
 * @author Sam Gunshor
 */
public class RemoveLastReturnsButDoesNotRemove<E> extends DoublyLinkedList<E> {
    @Override
    public E removeLast() {
        // Returns last value but leaves list unchanged.
        return super.getLast();
    }
}
