import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999));
        playerList.add(new Player(2, "Goku", 500));
        playerList.add(new Player(3, "Deku", 100));

        for (Player player : playerList) {
            System.out.println(player);
        }

        playerList.add(2, new Player(4,"Sakamoto", 10));

        System.out.println("\nPlayer at index 0 " + playerList.get(0));

        playerList.remove(1);

        for (Player player : playerList) {
            System.out.println(player);
        }

        boolean contains = playerList.contains(new Player(1, "Saitama", 999));
        System.out.println("\nList has Saitama? " + contains);
    }
}
