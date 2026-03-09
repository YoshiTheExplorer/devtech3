/**
 * @author Sam Gunshor
 */
public class RemoveAtIndexAlwaysRemovesLast<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        // Ignores index and removes last element.
        return super.remove(super.size() - 1);
    }
}
