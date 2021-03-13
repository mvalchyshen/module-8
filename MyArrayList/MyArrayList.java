package module8.HomeWork.MyArrayList;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 16;
    private E[] array;
    private  int size;

    public MyArrayList()
    {
        this.array = (E[]) new  Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(E element) {
        if (element == null) {
            throw new NullPointerException();
        }
        if (size >= array.length) {
            resize(array);
        }
        array[size] = element;
        size++;
    }

    private void resize(E[] array) {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
         this.array = newArray;
    }
    public E remove(int index) {
        int newSize;
        E element = array[index];
        if ((newSize= size - 1) > index) {
            System.arraycopy(array, index +1, array,index,newSize-index);
        }
        array[size = newSize] = null;
        return element;
    }

    public void clear() {
        array =  (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }
    public E get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }

        }
        return result.toString() + "]";
    }
}
