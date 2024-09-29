import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new java.util.HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item item : cart.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
