public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        if (head != null) {
            newNode.setNext(head);
        }

        head = newNode;
    }

    public void printList() {
        PlayerNode current = head;

        System.out.println("HEAD -> ");

        while (current != null) {
            System.out.println(current.getPlayer()+ " - > ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }
}
