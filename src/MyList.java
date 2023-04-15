public interface MyList<T> extends Iterable<T> {
     void add(T element);
     void add(T element, int index);
     void remove(int index);
     Object get(int index);
     int size();
     boolean contains(Object o);
}
