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

    public List<BasketItem> getItems() {
        for (BasketItem basketItem : basketItems) {
            System.out.println(basketItem.getBasketItemName());
        }
        return basketItems;
    }

    public int getQuantityOfItem(BasketItem item) {
        int itemQuantity = 0;

        for (BasketItem basketItem : basketItems) {
            if (basketItem.getBasketItemName().equals(item.getBasketItemName())) {
                itemQuantity++;
            }
        }
        return itemQuantity;
    }

    public double BuyOneGetOneFreeOfferCalculation(int itemQuantity) {
        int newQuantity = itemQuantity;

        if (itemQuantity > 1) {
            newQuantity = itemQuantity - (itemQuantity / 2);
        }
        return newQuantity;
    }

    public int ThreeForThePriceOfTwoOfferCalculation(int itemQuantity) {
        int newQuantity = itemQuantity;

        if (itemQuantity > 2) {
            newQuantity = itemQuantity - (itemQuantity / 3);
        }
        return newQuantity;
    }

    public double CalculateTotal() {
        totalAmount = 0;
        int melonQuantity = 0;
        double melonTotal = 0;
        int limeQuantity = 0;
        double limeTotal = 0;

        for (BasketItem basketItem : basketItems) {
            if (basketItem.getBasketItemName().equals("Melon")) {
                melonQuantity++;
                continue;
            }
            if (basketItem.getBasketItemName().equals("Lime")) {
                limeQuantity++;
                continue;
            }
            totalAmount = totalAmount + basketItem.getBasketItemPrice();
        }
        melonTotal = BuyOneGetOneFreeOfferCalculation(melonQuantity) * 0.50;
        limeTotal = ThreeForThePriceOfTwoOfferCalculation(limeQuantity) * 0.15;

        totalAmount = totalAmount + melonTotal + limeTotal;

        System.out.printf("Total Amount: %.2f", totalAmount);

        return totalAmount;
    }
}
