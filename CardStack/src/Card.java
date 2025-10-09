public class Card {
    private String type;
    private String name;

    public Card(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
