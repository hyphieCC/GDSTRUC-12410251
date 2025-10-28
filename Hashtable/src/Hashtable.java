public class Hashtable {
    private Player[] hashtable;

    public Hashtable() {
        hashtable = new Player[10];
    }

    public int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public boolean isOccupied(int hashedKey) {
        return hashtable[hashedKey] != null;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);
        int stoppingKey = hashedKey;

        while (isOccupied(hashedKey)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
            if (hashedKey == stoppingKey) {
                System.out.println("Hashtable is full! Cannot insert " + key);
                return;
            }
        }
        hashtable[hashedKey] = value;
        System.out.println("Inserted player " + key + " at index " + hashedKey);
    }

    public Player get(String key) {
        int hashedKey = hashKey(key);
        int stoppingKey = hashedKey;

        while (isOccupied(hashedKey)) {
            if (hashtable[hashedKey].getName().equals(key)) {
                return hashtable[hashedKey];
            }

            hashedKey = (hashedKey + 1) % hashtable.length;

            if (hashedKey == stoppingKey) {
                break;
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("Element " + i + " = " + hashtable[i]);
        }
    }
}