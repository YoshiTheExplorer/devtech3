import java.util.NoSuchElementException;

/**
 * @author Colin Yamada
 */
public class GetFirstBroken<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }
}