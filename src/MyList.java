public interface MyList<T> extends Iterable<T> {
     void add(T element);
     void add(T element, int index);
     boolean remove(int index);
     Object get(int index);
     int size();
     boolean contains(Object o);
     int indexOf(Object o);
     int lastIndexOf(Object o);
}
