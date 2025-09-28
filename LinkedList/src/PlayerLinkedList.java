public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        if (head != null) {
            newNode.setNext(head);
        }

        head = newNode;
        size++;
    }

    public void removeFront() { //will always remove first element, no need for Player parameter
        if (head == null) {
            return;
        }

        head = head.getNext();
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int i = 0;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return i;
            }

            current = current.getNext();
            i++;
        }

        return -1;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer()+ " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }
}