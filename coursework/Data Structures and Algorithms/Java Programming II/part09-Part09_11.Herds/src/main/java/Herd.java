import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : this.herd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String herdString = "";
        for (Movable movable : this.herd) {
            herdString += movable.toString() + "\n";
        }
        return herdString;
    }
}
