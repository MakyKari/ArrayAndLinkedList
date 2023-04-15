import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[64];
        this.size = 0;
    }
    private void increaseCapacity(){
        Object[] temp = new Object[size * 2];
        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    @Override
    public void add(T element){
        if(size >= data.length){
            increaseCapacity();
        }
        data[size++] = element;
    }

    @Override
    public void add(T element, int index) {
        size++;
        if(size >= data.length){
            increaseCapacity();
        }
        if(index >= size) throw new IndexOutOfBoundsException();

        for(int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = element;
    }

    @Override
    public T get(int index){
        if(index >= size) throw new IndexOutOfBoundsException();
        return (T)data[index];
    }
    @Override
    public boolean remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public T remove(T item) {
        remove(indexOf(item));
        return item;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{
        private int index;
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return get(index++);
        }
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(o)) return true;
        }

        return false;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i = size - 1; i >= 0; i--){
            if(data[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public void clear() {
        data = new Object[64];
        size = 0;
    }

    @Override
    public void sort() {
    }
}
