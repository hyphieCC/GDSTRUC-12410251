import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int DECK_SIZE = 30;

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CardStack playerDeck = new CardStack(DECK_SIZE);
        CardStack playerHand = new CardStack(DECK_SIZE);
        CardStack discardPile = new CardStack(DECK_SIZE);

        playerDeck.push(new Card("Fire", "Charmander"));
        playerDeck.push(new Card("Fire", "Torchic"));
        playerDeck.push(new Card("Fire", "Scorbunny"));
        playerDeck.push(new Card("Fire", "Fennekin"));
        playerDeck.push(new Card("Fire", "Cyndaquil"));

        playerDeck.push(new Card("Water", "Squirtle"));
        playerDeck.push(new Card("Water", "Totodile"));
        playerDeck.push(new Card("Water", "Froakie"));
        playerDeck.push(new Card("Water", "Oshawott"));
        playerDeck.push(new Card("Water", "Mudkip"));

        playerDeck.push(new Card("Grass", "Bulbasaur"));
        playerDeck.push(new Card("Grass", "Snivy"));
        playerDeck.push(new Card("Grass", "Treecko"));
        playerDeck.push(new Card("Grass", "Rowlet"));
        playerDeck.push(new Card("Grass", "Sprigatito"));

        playerDeck.push(new Card("Electric", "Pikachu"));
        playerDeck.push(new Card("Electric", "Dedenne"));
        playerDeck.push(new Card("Electric", "Pachirisu"));
        playerDeck.push(new Card("Electric", "Pawmi"));
        playerDeck.push(new Card("Electric", "Rotom"));

        playerDeck.push(new Card("Flying", "Pidgey"));
        playerDeck.push(new Card("Flying", "Taillow"));
        playerDeck.push(new Card("Flying", "Pidove"));
        playerDeck.push(new Card("Flying", "Hoothoot"));
        playerDeck.push(new Card("Flying", "Fletchling"));

        playerDeck.push(new Card("Bug", "Weedle"));
        playerDeck.push(new Card("Bug", "Surskit"));
        playerDeck.push(new Card("Bug", "Nincada"));
        playerDeck.push(new Card("Bug", "Larvesta"));
        playerDeck.push(new Card("Bug", "Scatterbug"));

    }

    public void drawCards(int num, CardStack deck, CardStack hand) {
        for (int i = 0; i >= num; i++) {

        }
    }
}

