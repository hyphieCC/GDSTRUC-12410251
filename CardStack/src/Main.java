import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int DECK_SIZE = 30; //using array

        CardStack playerDeck = new CardStack(DECK_SIZE);
        CardStack playerHand = new CardStack(DECK_SIZE);
        CardStack discardPile = new CardStack(DECK_SIZE);

        //region Pokemon Cards
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
        //endregion

        System.out.println("Pokemon TCG\nYou start with a 30-card deck.\n");

        while (!playerDeck.isEmpty()) {
            int action = random.nextInt(3); //action type, for switch case
            int amt = random.nextInt(5) + 1; //amount of cards

            switch (action) {
                case 0:
                    System.out.println("Draw " + amt + " cards.");
                    moveCards(amt, playerDeck, playerHand);
                    break;
                case 1:
                    System.out.println("Discard " + amt + " cards.");
                    moveCards(amt, playerHand, discardPile);
                    break;
                case 2:
                    System.out.println("Take back " + amt + " cards.");
                    moveCards(amt, discardPile, playerHand);
                    break;
            }

            System.out.println("\nYour Hand:");
            playerHand.print();

            System.out.println("\nRemaining cards in Deck: " + playerDeck.size());
            System.out.println("Cards in Discard Pile: " + discardPile.size());

            scanner.nextLine();
        }
    }

    public static void moveCards(int num, CardStack from, CardStack to) {
        if (from.isEmpty()) {
            System.out.println("No cards in this stack.");
            return;
        }

        int max = Math.min(num, from.size()); //smallest number between num and size of stack, resolves unnecessary looping if num is higher than size

        for (int i = 0; i < max; i++) {
            Card card = from.pop();
            to.push(card);
        }
    }
}