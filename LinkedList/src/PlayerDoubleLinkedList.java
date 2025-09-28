public class PlayerDoubleLinkedList {
    private PlayerNode head;
    private PlayerNode tail;
    private int size;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        size++;
    }

    public void removeFront() {
        if (head == null) {
            return;
        }

        head = head.getNext();

        if (head != null) {
            head.setPrev(null);
        } else {
            tail = null;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public void printListForward () {
        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }

    public void printListBackward () {
        System.out.print("TAIL -> ");
        PlayerNode current = tail;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getPrev();
        }

        System.out.print("NULL");
    }
}