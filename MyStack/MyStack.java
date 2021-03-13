package module8.HomeWork.MyStack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] data;
    private int size;

    public MyStack(){
        this.data = (T[])  new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void push(T item){
        if (item == null) {
            throw new NullPointerException();
        }
        if (size == data.length) {
            resize();
        }
        data[size] = item;
        size++;
    }

    private void resize() {
        data = (T[]) Arrays.copyOf(data, (size * 3 / 2 + 1));
    }

    public T remove(int index){
        Objects.checkIndex(index,size);
        T element = data[index];
        int newSize;
        if ((newSize = size - 1) > index) {
            System.arraycopy(data,index + 1, data, index, newSize - index);
        }
        data[size = newSize] = null;
        return element;
    }
    public void clear(){
        data = (T[])  new Object[INITIAL_CAPACITY];
        size = 0;
    }
    public int size(){return size;}

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T element = data[size - 1];
        return element;
    }
    public T pop() {
        T element = data[size - 1];
        remove(size - 1);
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString() ;
    }
}
