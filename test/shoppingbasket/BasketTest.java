package shoppingbasket;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author konstantinoschourdakis
 */
public class BasketTest {

    public BasketTest() {
    }

    Basket basket = new Basket();

    Item apple = new Item("Apple", (float) 0.35);
    Item banana = new Item("Banana", (float) 0.20);
    Item melon = new Item("Melon", (float) 0.50);
    Item lime = new Item("Lime", (float) 0.15);

    BasketItem basketItemApple = new BasketItem(apple);
    BasketItem basketItemBanana = new BasketItem(banana);
    BasketItem basketItemMelon = new BasketItem(melon);
    BasketItem basketItemLime = new BasketItem(lime);

    /**
     * Test of getQuantityOfItem method, of class Basket.
     */
    @Test
    public void testGetQuantityOfItem() {
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);
        basket.addItem(basketItemApple);
        int expResult = 4;
        int result = basket.getQuantityOfItem(basketItemApple);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetQuantityOfItemZero() {
        int expResult = 0;
        int result = basket.getQuantityOfItem(basketItemApple);
        assertEquals(expResult, result);
    }

    /**
     * Test of BuyOneGetOneFreeOfferCalculation method, of class Basket.
     */
    @Test
    public void testBuyOneGetOneFreeOfferCalculation() {
        int itemQuantity = 4;
        double expResult = 2;
        double result = basket.BuyOneGetOneFreeOfferCalculation(itemQuantity);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testBuyOneGetOneFreeGivenQuantityLessThanTwo() {
        int itemQuantity = 1;
        double expResult = 1;
        double result = basket.BuyOneGetOneFreeOfferCalculation(itemQuantity);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of ThreeForThePriceOfTwoOfferCalculation method, of class Basket.
     */
    @Test
    public void testThreeForThePriceOfTwoOfferCalculation() {
        int itemQuantity = 6;
        int expResult = 4;
        int result = basket.ThreeForThePriceOfTwoOfferCalculation(itemQuantity);
        assertEquals(expResult, result);
    }

    @Test
    public void testThreeForThePriceOfTwoGivenQuantityLessThanThree() {
        int itemQuantity = 2;
        int expResult = 2;
        int result = basket.ThreeForThePriceOfTwoOfferCalculation(itemQuantity);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculateTotal method, of class Basket.
     */
    @Test
    public void testCalculateTotal() {
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

        double expResult = 3.65;
        double result = basket.CalculateTotal();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalculateTotalWithNoItems() {
        double expResult = 0.00;
        double result = basket.CalculateTotal();
        assertEquals(expResult, result, 0.01);
    }
}
