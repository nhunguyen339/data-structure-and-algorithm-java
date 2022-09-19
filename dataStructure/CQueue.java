package dataStructure;

public class CQueue {
    int capacity;
    int[] arr;
    int rear;
    int front;

    CQueue(int size) {
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
            System.out.println("enqueue: " + value );

            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % capacity;

            arr[rear] = value;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("arr empty");
            System.exit(1);
        } else {
            System.out.println("dequeue: " + arr[front]);

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }

            return arr[front];
        }

        return -1;
    }

    private boolean isEmpty() {
        return front == -1;
    }

    private boolean isFull() {
        if (front == -1 && rear == capacity - 1) {
            return true;
        }

        if (front == rear + 1) {
            return true;
        }

        return false;
    }

    private void printArr() {
        int i;
        if (isEmpty()) {
            System.out.println("array is empty");
        } else {
            System.out.println("===== print arr ======");

            for (i = front; i != rear; i = (i + 1) % capacity ) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue(3);

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(7);
//        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(7);


        queue.printArr();
    }
}
