public interface MyList<T> extends Iterable<T> {
     void add(T element);
     void remove(int index);
     Object get(int index);
     int size();
}
