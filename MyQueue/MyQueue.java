package HomeWork.MyQueue;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] array;
    private int size;

    public MyQueue() {
        this.array = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T item){
        if (item == null) {
            throw new NullPointerException();
        }
        if (size == array.length) {
            resize();
        }
        array[size] = item;
        size++;
    }

    private void resize() {
        array = (T[]) Arrays.copyOf(array, (size * 3 / 2 + 1));
    }

    public T remove(int index) {
        Objects.checkIndex(index,size);
        T element = array[index];
        int newSize;
        if ((newSize = size - 1) > index) {
            System.arraycopy(array,index + 1, array, index, newSize - index);
        }
        array[size = newSize] = null;
        return element;
    }

    public void clear() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {return array[0];}

    public T poll() {
        T element  = array[0];
        remove(0);
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString() ;
    }
}
