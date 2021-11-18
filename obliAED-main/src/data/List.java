package data;

public class List<T>
{
    private Node<T> _head;
    private Node<T> _tail;

    public boolean contains(T data) {
        Node<T> aux = _head;
        while (aux != null) {
            if (aux.Data == data) {
                return true;
            }
            aux = aux.Next;
        }
        return false;
    }

    public void add(T data) {
        if (!contains(data)) {
            _tail.Next = new Node<T>(data);
            _tail = _tail.Next;
        }
    }
}
