import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Player> stack;

    public LinkedStack() {
        stack = new LinkedList<Player>();
    }

    public void push(Player player) {
        stack.push(player);
    }

    public Player pop() {
        if (isEmpty()) {
            return null;
        }

        return stack.pop();
    }

    public Player peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void print() {
        ListIterator<Player> listIterator = stack.listIterator();

        System.out.println("Printing stack..");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
