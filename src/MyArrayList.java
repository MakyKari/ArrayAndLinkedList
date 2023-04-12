import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[2];
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
    public T get(int index){
        if(index >= size) throw new IndexOutOfBoundsException();
        return (T)data[index];
    }
    @Override
    public void remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
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
}
