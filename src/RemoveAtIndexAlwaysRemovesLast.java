/**
 * @author Sam Gunshor
 */
public class RemoveAtIndexAlwaysRemovesLast<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        // Ignores index and removes the last element instead.
        return super.remove(super.size() - 1);
    }
}
