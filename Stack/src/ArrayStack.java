public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int cap) {
        stack = new Player[cap];
        top = 0;
    }

    public void push(Player player) {
        if (top == stack.length) {
            Player[] newStack = new Player[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;
    }

    public Player pop() {
        if (isEmpty()) {
            return null;
        }

        return stack[--top];
    }

    public Player peek() {
        if (isEmpty()) {
            return null;
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {
        System.out.println("Printing Stack..");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
