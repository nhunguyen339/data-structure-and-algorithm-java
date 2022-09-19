package dataStructure;

public class Queue {
    int capacity;
    int[] arr;
    int rear;
    int front;

    Queue(int size) {
        arr = new int[size];
        rear = -1;
        front = -1;
        capacity = size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("arr is full");
            System.exit(1);
        } else {
            if (rear == -1) {
                front++;
            }
            if (rear == front & front == capacity - 1) {
                System.out.println("out of memory");
                return;
            } else {
                arr[++rear] = value;
            }
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("arr empty");
            System.exit(1);
        } else {
            return arr[front++];
        }

        return -1;
    }

    private boolean isEmpty() {
        return getArrayLength() == 0;
    }

    private boolean isFull() {
        int currentArrLength = getArrayLength();
      return currentArrLength == capacity;
    }

    private int getArrayLength() {
        if (front == rear) {
            if (front == -1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return rear - front + 1;
        }
    }

    private void printArr() {
        for (int i = front; i <= getArrayLength(); i ++) {
            System.out.println("print arr: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(7);
//        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);

        queue.printArr();
    }
}
