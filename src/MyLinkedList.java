import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{

    private class Node{
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
    public void add(T element, int index) {
        size++;
        if(index >= size) throw new IndexOutOfBoundsException();
        if(index == 0) {
            Node temp = head;
            head.prev = new Node(element);
            head = head.prev;
            head.next = temp;
            return;
        }
        if(index == size - 1){
            add(element);
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        Node first = temp;
        Node second = temp.next;
        temp.next = new Node(element);
        temp = temp.next;
        temp.prev = first;
        temp.next = second;
        Node middle = temp;
        temp = temp.next;
        temp.prev = middle;
    }

    @Override
    public boolean remove(int index) {
        if(index >= size) throw new IndexOutOfBoundsException();
        size--;
        if(index == 0){
            head = head.next;
            head.prev = null;
            return true;
        }
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
        return true;
    }

    @Override
    public T remove(T item) {
        remove(indexOf(item));
        return item;
    }

    @Override
    public T get(int index) {
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

    @Override
    public boolean contains(Object o) {
        Node temp = head;
        while(temp != null){
            if(temp.data.equals(o)) return true;
            temp = temp.next;
        }

        return false;
    }
    @Override
    public int indexOf(Object o) {
        Node temp = head;
        for(int i = 0; i < size; i++){
            if(temp.data.equals(o)) return i;
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node temp = tail;
        for(int i = size - 1; i >= 0; i--){
            if(temp.data.equals(o)) return i;
            temp = temp.prev;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void sort() {
        Node first = head;
        while(first != null){
            Node second = head;
            while(second.next != null){
                if(second.data.compareTo(second.next.data) > 0){
                    T temp = second.next.data;
                    second.next.data = second.data;
                    second.data = temp;
                }
                second = second.next;
            }
            first = first.next;
        }
    }
}
