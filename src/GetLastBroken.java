import java.util.NoSuchElementException;

/**
 * @author Colin Yamada
 */
public class GetLastBroken<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }
}