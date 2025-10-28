public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 25);
        Player celebi = new Player(251, "Celebi", 251);
        Player hitmonchan = new Player(107, "Hitmonchan", 107);
        Player mankey = new Player(56, "Mankey", 56);
        Player starmie = new Player(121, "Starmie", 121);
        Player togepi = new Player(56, "Togepi", 56);

        Hashtable hashtable = new Hashtable();
        hashtable.put(pikachu.getName(), pikachu);
        hashtable.put(celebi.getName(), celebi);
        hashtable.put(hitmonchan.getName(), hitmonchan);
        hashtable.put(mankey.getName(), mankey);
        hashtable.put(starmie.getName(), starmie);
        hashtable.put(togepi.getName(), togepi);

        hashtable.print();

        System.out.println("\nElement at key " + togepi.getName() + " = " + hashtable.get(togepi.getName()));
    }
}
