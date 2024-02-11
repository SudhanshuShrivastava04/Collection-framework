import java.util.Iterator;
import java.util.function.Consumer;

public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public GenericList(){
        size = 0;
        items = (T[])new Object[100];
    }

    public void add(T item){
        items[size ++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index = 0;
        public GenericListIterator(GenericList<T> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index ++];
        }
    }

}
