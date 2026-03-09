/**
 * @author Colin Yamada
 */
public class AddFirstBroken<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        linkLast(e);
    }
}
