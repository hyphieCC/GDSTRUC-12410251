public class Main {
    public static void main(String[] args) {
        System.out.println("Singly Linked List: ");
        PlayerLinkedList playerList = new PlayerLinkedList();
        playerList.addToFront(new Player(1,"Saitama",999));
        playerList.addToFront(new Player(2,"Goku",500));
        playerList.addToFront(new Player(3,"Deku",100));

        playerList.printList();
        System.out.println("\nSize of list: " + playerList.size());
        System.out.println("Contains Deku? " + playerList.contains(new Player(3,"Deku",100)));
        System.out.println("Index of Goku: " + playerList.indexOf(new Player(2, "Goku", 500)));

        System.out.println("\nRemoving First Element: ");
        playerList.removeFront();
        playerList.printList();
        System.out.println("\nSize of list: " + playerList.size());

        System.out.println("Contains Deku? " + playerList.contains(new Player(3,"Deku",100)));
        System.out.println("Index of Goku: " + playerList.indexOf(new Player(2, "Goku", 500)));

        System.out.println("\nDoubly Linked List: ");
        PlayerDoubleLinkedList playerDoubleList = new PlayerDoubleLinkedList();
        playerDoubleList.addToFront(new Player(1, "Yuki", 33));
        playerDoubleList.addToFront(new Player(2, "Aigis", 36));
        playerDoubleList.addToFront(new Player(3, "Yukari", 30));
        playerDoubleList.addToFront(new Player(4, "Junpei", 32));
        playerDoubleList.addToFront(new Player(5, "Koromaru", 99));

        playerDoubleList.printListForward();
        System.out.print("\n");
        playerDoubleList.printListBackward();
        System.out.println("\nSize of list: " + playerDoubleList.size());

        System.out.println("\nRemoving First Element: ");
        playerDoubleList.removeFront();
        playerDoubleList.printListForward();
        System.out.print("\nSize of list: " + playerDoubleList.size());
    }
}