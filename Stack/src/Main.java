public class Main {
    public static void main(String[] args) {
        LinkedStack playerStack = new LinkedStack();
        playerStack.push(new Player(1, "Deku", 20));
        playerStack.push(new Player(2, "Goku", 20));
        playerStack.push(new Player(3, "Saitama", 20));

        playerStack.print();

        System.out.println("Pop element " + playerStack.pop());
        System.out.println("Peek after pop " + playerStack.peek());

        playerStack.push(new Player(4, "Sakamoto", 20));
        playerStack.print();
    }
}
