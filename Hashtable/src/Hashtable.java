public class Hashtable {
    // Solution used is tombstones
    // https://stackoverflow.com/questions/77786084/why-are-tombstones-needed-in-an-open-addressing-hashtable

    private final SavedPlayer[] hashtable;
    private static final SavedPlayer REMOVED = new SavedPlayer("REMOVED", null);

    public Hashtable() {
        hashtable = new SavedPlayer[10];
    }

    public int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public boolean isOccupied(int hashedKey) {
        return hashtable[hashedKey] != null && hashtable[hashedKey] != REMOVED;
    }

    public boolean isRemoved(int hashedKey) {
        return hashtable[hashedKey] == REMOVED;
    }

    public int findKey(String key) {
        int hashedKey = hashKey(key);
        int stoppingIndex = hashedKey;

        while (hashtable[hashedKey] != null) {
            if (hashtable[hashedKey] != REMOVED &&
                    hashtable[hashedKey].getKey().equals(key)) {
                return hashedKey;
            }

            hashedKey = (hashedKey + 1) % hashtable.length;
            if (hashedKey == stoppingIndex) {
                break;
            }
        }

        return -1;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);
        int stoppingKey = hashedKey;
        int availableSlot = -1;

        while (hashtable[hashedKey] != null) {
            if (isRemoved(hashedKey) && availableSlot == -1) {
                availableSlot = hashedKey;
            }
            else if (isOccupied(hashedKey) && hashtable[hashedKey].getKey().equals(key)) {
                hashtable[hashedKey] = new SavedPlayer(key, value);
                return;
            }

            hashedKey = (hashedKey + 1) % hashtable.length;

            if (hashedKey == stoppingKey) {
                System.out.println("Cannot put player " + key + ". Hashtable is full.");
                return;
            }
        }

        if (availableSlot != -1) {
            hashtable[availableSlot] = new SavedPlayer(key, value);
        } else {
            hashtable[hashedKey] = new SavedPlayer(key, value);
        }
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].getValue();
    }

    public Player remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        Player removedPlayer = hashtable[hashedKey].getValue();
        hashtable[hashedKey] = REMOVED;
        return removedPlayer;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("Element " + i + " = null");
            }
            else if (hashtable[i] == REMOVED) {
                System.out.println("Element " + i + " = [REMOVED]");
            }
            else {
                System.out.println("Element " + i + " = " + hashtable[i].getValue());
            }
        }
    }
}