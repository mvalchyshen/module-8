package module8.HomeWork.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(21);
        myStack.push(19);
        myStack.push(17);
        myStack.push(6);
        myStack.push(5);
        myStack.push(0);
        System.out.println(myStack + "; "
                + "Size = " + myStack.size() + "; "
                + "First element in stack = " + myStack.peek());
        myStack.remove(5);
        System.out.println(myStack + "; "
                + "Size = " + myStack.size() + "; "
                + "First element in stack = " + myStack.peek());
        myStack.pop();
        System.out.println(myStack + "; "
                + "Size = " + myStack.size() + "; "
                + "First element in stack = " + myStack.peek());
        myStack.clear();
        System.out.println(myStack + "; "
                + "Size = " + myStack.size() + "; "
                + "First element in stack = " + myStack.peek());
    }
}
