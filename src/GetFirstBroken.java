import java.util.NoSuchElementException;

/**
 * @author Colin Yamada
 */
public class GetFirstBroken<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        // returns last element instead of first
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }
}