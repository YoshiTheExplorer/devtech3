/**
 * @author Colin Yamada
 */
public class AddIntBroken<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);

        if (index == size) {
            linkLast(element);
        } else {
            // Incorrectly adds at index + 1 instead of index
            Node<E> succ = node(index + 1 < size ? index + 1 : index);
            final Node<E> pred = succ.prev;
            final Node<E> newNode = new Node<>(pred, element, succ);
            succ.prev = newNode;
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            size++;
        }
    }
}
