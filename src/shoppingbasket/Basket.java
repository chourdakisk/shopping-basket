package shoppingbasket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author konstantinoschourdakis
 */
public class Basket {

    List<BasketItem> basketItems;
    double totalAmount;

    public Basket() {
        basketItems = new ArrayList<BasketItem>();
        totalAmount = 0;
    }

    public void addItem(BasketItem item) {
        this.basketItems.add(item);
    }

    public void removeItem(BasketItem item) {
        this.basketItems.remove(item);
    }

}
