import java.util.Objects;
import java.util.Random;

public class Player {
    private int id;
    private int level;

    public Player(int id) {
        this.id = id;
        this.level = new Random().nextInt(100) + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, level);
    }
}