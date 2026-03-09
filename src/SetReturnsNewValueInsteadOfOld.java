/**
 * @author Sam Gunshor
 */
public class SetReturnsNewValueInsteadOfOld<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        super.set(index, element);
        // Wrong contract: should return old value.
        return element;
    }
}
