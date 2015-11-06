package shoppingbasket;

/**
 *
 * @author konstantinoschourdakis
 */
public class RunCalculation {

    public static void main(String[] arguments) {

        Item apple = new Item("Apple", (float) 0.35);
        Item banana = new Item("Banana", (float) 0.20);
        Item melon = new Item("Melon", (float) 0.50);
        Item lime = new Item("Lime", (float) 0.15);

        BasketItem basketItemApple = new BasketItem(apple);
        BasketItem basketItemBanana = new BasketItem(banana);
        BasketItem basketItemMelon = new BasketItem(melon);
        BasketItem basketItemLime = new BasketItem(lime);

        Basket basket = new Basket();
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);

        basket.addItem(basketItemBanana);
        basket.addItem(basketItemBanana);
        basket.addItem(basketItemBanana);
        basket.addItem(basketItemBanana);

        basket.addItem(basketItemMelon);
        basket.addItem(basketItemMelon);
        basket.addItem(basketItemMelon);
        basket.addItem(basketItemMelon);

        basket.addItem(basketItemLime);
        basket.addItem(basketItemLime);
        basket.addItem(basketItemLime);
        basket.addItem(basketItemLime);

        basket.getItems();
        basket.CalculateTotal();

    }

}
