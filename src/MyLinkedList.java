import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        public Node() {
            this.next = null;
            this.prev = null;
        }

        public Node(T elem){
            this();
            data = elem;
        }
    }
    Node head;
    Node tail;
    int size;
    public void MyArrayList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void add(T element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
