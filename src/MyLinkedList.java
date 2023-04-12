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
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void add(T element) {
        size++;
        if(head == null){
            head = new Node(element);
            tail = new Node(element);
            return;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;
        Node previous = temp;

        temp.next = new Node(element);
        temp = temp.next;

        temp.prev = previous;

        tail = temp;
    }

    @Override
    public void remove(int index) {
        if(index >= size) throw new IndexOutOfBoundsException();
        size--;
        Node temp = head;
        Node p;
        Node n;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        p = temp.prev;
        n = temp.next;

        p.next = n;
        n.prev = p;
    }

    @Override
    public Object get(int index) {
        if(index >= size) throw new IndexOutOfBoundsException();
        Node temp = head;
        for(int i = 0; i < index; i++) temp = temp.next;
        return temp.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{
        Node temp = head;
        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public T next() {
            T data = temp.data;
            temp = temp.next;
            return data;
        }
    }
}
