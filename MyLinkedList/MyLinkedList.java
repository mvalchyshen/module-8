package HomeWork.MyLinkedList;

public class MyLinkedList<E> {

    private int size = 0;
    MyNode<E> first;
    MyNode<E> last;

    private static class MyNode<E> {
        E item;
        MyNode<E> next;
        MyNode<E> previous;

        public MyNode(E item, MyNode<E> next, MyNode<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
        public MyNode(E item) {
            this.item = item;
        }

    }

    public void add(E e) {
        if (first == null){
            addFirst(e);
            return;
        }
        MyNode<E> l = last;
        MyNode<E> newNode = new MyNode<>(e, null, l);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private void addFirst(E e) {
        MyNode<E> newNode = new MyNode<>(e);
        newNode.next = first;
        first = newNode;
        size++;
        if (last == null) {
            last = first;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Out of range");
        } else if (index == 0){
            removeFirst();
            return;
        } else if (index == size - 1) {
            removeLast();
            return;
        } else {
            MyNode<E> previous = first;

            for (int i = 0; i < index; i++) {
                previous = previous.next;
            }

            MyNode<E> current = previous.next;
            previous.next = current.next;
            size--;
        }
    }


    private void removeFirst() {
        MyNode<E> temp = first;
        first = first.next;
        size--;
    }

    private void removeLast() {
        if (size == 0){
            System.out.println("Nothing to delete");
        } else if (size == 1) {
            MyNode<E> temp = first;
            first = last = null;
            size = 0;
        } else {
            MyNode<E> current = first;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            MyNode<E> temp = last;
            last = current;
            last.next = null;
            size--;
        }
    }

    public E get(int index) {
        if (index < 0 ||index > size) {
            System.err.println("Out of range");
        } else if (index == 0) {
             return getFirst();
        } else if (index == size - 1) {
             return getLast();
        } else {
            MyNode<E> current = first.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.item;
        }
       return null;
    }

    private E getLast() {
        if (size == 0) {
            return null;
        } else {
            return last.item;
        }
    }

    private E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return first.item;
        }
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        MyNode<E> cur = first;
        for (int i = 0; i < size; i++) {
            result.append(cur.item);
            cur = cur.next;
            if (cur != null) {
                result.append(", ");
            }

        }
        return result.toString() + "]";
    }
}


