/**
 * @author Colin Yamada
 */
public class AddLastBroken<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        // Incorrectly adds to the first position instead of last
        linkFirst(e);
    }
}
