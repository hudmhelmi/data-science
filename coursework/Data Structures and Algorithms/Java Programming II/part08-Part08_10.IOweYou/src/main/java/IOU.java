import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOUMap;

    public IOU() {
        this.IOUMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.IOUMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.IOUMap.getOrDefault(toWhom, 0.0);
    }
}
