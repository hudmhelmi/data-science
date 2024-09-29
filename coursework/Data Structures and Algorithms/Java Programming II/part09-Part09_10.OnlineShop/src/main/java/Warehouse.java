import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> inventory;
    private Map<String, Integer> prices;

    public Warehouse() {
        inventory = new java.util.HashMap<>();
        prices = new java.util.HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        inventory.put(product, stock);
        prices.put(product, price);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return inventory.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (inventory.containsKey(product) && inventory.get(product) > 0) {
            inventory.put(product, inventory.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return inventory.keySet();
    }
}
