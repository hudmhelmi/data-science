public class Container {
    private int volume;
    private final int capacity = 100;
    
    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.volume += amount;
        }

        if (this.volume > this.capacity) {
            this.volume = this.capacity;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.volume -= amount;
        }

        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public String toString() {
        return this.volume + "/" + this.capacity;
    }

    public int getVolume() {
        return this.volume;
    }
}
