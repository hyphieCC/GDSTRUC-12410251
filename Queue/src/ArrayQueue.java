public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int cap) {
        queue = new Player[cap];
        front = 0;
        back = 0;
    }

    public void enqueue(Player player) {
        if (back == queue.length) {
            int currentSize = size();
            Player[] newQueue = new Player[queue.length * 2];
            System.arraycopy(queue, front, newQueue, 0, currentSize);
            queue = newQueue;
            front = 0;
            back = currentSize;
        }

        queue[back++] = player;
    }

    public Player dequeue() {
        if (size() == 0) {
            return null;
        }

        Player removedPlayer = queue[front];
        queue[front++] = null;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek() {
        if (size() == 0) {
            return null;
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}