package dataStructure;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size) {
        capacity = size;
        top = -1;
        arr =  new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("arr is full");
            System.exit(1);
        }

        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("arr is empty");
            System.exit(1);
        }

        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return capacity == top + 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        System.out.println("===== print arr ====== ");
        for (int i = 0; i <= top; i++) {
            System.out.println("item:" + arr[i]);
        }
    }

    public static void main(String[] agrs) {
        Stack stack = new Stack(2);

        stack.push(1);
        stack.push(12);
        stack.pop();

        stack.printStack();
    }




}
