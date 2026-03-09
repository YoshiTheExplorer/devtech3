/**
 * @author Colin Yamada
 */
public class AddLastBroken<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        linkFirst(e);
    }
}
