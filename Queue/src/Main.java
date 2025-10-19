import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(10);
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int games = 0;
        int playerId = 1; // not using names, uses sequential id instead

        while (games < 10) {
            System.out.println("Game " + (games + 1) + " lobby:");

            int players = rand.nextInt(7) + 1;
            System.out.println(players + " players joined the lobby!");

            for (int i = 0; i < players; i++) {
                Player player = new Player(playerId++);
                queue.enqueue(player);
            }

            System.out.println("Current lobby ( " + queue.size() + " )");
            queue.printQueue();
            scan.nextLine();

            while (queue.size() >= 5 && games < 10) {
                System.out.println("Game " + (games + 1) + " starting!");
                System.out.println("Players in game:");

                for (int i = 0; i < 5; i++) {
                    Player inGame = queue.dequeue();
                    System.out.println(inGame);
                }

                games++;
                scan.nextLine();
            }

            System.out.println("Current players in queue: " + queue.size());
            queue.printQueue();
            scan.nextLine();
        }

        System.out.print("10 Games created, wait for next reset to queue again!");
    }
}
