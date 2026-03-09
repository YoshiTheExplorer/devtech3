/**
 * @author Colin Yamada
 */
public class GetBroken<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        // Incorrectly returns the element at index + 1 instead of index
        checkElementIndex(index);
        if (index + 1 < size) {
            return node(index + 1).item;
        }
        throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
}
