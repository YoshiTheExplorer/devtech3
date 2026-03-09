/**
 * @author Colin Yamada
 */
public class AddFirstBroken<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        // Incorrectly adds to the last position instead of first
        linkLast(e);
    }
}
