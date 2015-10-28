package shoppingbasket;

/**
 *
 * @author konstantinoschourdakis
 */
public class BasketItem {

    private Item item;
    private int quantity;

    public BasketItem(Item item) {
        this.item = item;
        this.quantity = 1;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

}
