public class Container {
    private String name;
    private int volume;
    private final int capacity = 100;

    public Container(String name) {
        this.name = name;
        this.volume = 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            volume += amount;
        }

        if (volume > capacity) {
            volume = capacity;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            volume -= amount;
        }

        if (volume < 0) {
            volume = 0;
        }
    }

    public String toString() {
        return this.name + ": " + this.volume + "/" + this.capacity;
    }
}
