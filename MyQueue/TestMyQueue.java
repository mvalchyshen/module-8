package HomeWork.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(3);
        myQueue.add(6);
        myQueue.add(0);
        myQueue.add(8);
        myQueue.add(5);
        System.out.println(myQueue + "; "
                + "Размер : " + myQueue.size() + "; "
                + "Первый элемент = " + myQueue.peek());
        myQueue.remove(3);
        System.out.println("---------------------------");
        System.out.println(myQueue + "; "
                + "Размер : " + myQueue.size() + "; "
                + "Первый элемент = " + myQueue.peek());
        System.out.println("Удаляем первый элемент " + myQueue.poll());
        System.out.println("---------------------------");
        System.out.println(myQueue + "; "
                + "Размер : " + myQueue.size() + "; "
                + "Первый элемент = " + myQueue.peek());
        myQueue.clear();
        System.out.println("---------------------------");
        System.out.println(myQueue + "; "
                + "Размер : " + myQueue.size() + "; "
                + "Первый элемент = " + myQueue.peek());
    }
}
