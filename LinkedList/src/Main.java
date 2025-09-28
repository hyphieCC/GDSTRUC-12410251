public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerList = new PlayerLinkedList();
        playerList.addToFront(new Player(1,"Saitama",999));
        playerList.addToFront(new Player(2,"Goku",500));
        playerList.addToFront(new Player(3,"Deku",100));
        playerList.printList();


    }
}
