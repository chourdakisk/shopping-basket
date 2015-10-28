package shoppingbasket;

/**
 *
 * @author konstantinoschourdakis
 */
public class BillCalculation {

    int newQuantity = 0;

    public void BuyOneGetOneFreeOfferCalculation(BasketItem basketItem) {
        newQuantity = basketItem.getQuantity();

        if (basketItem.getQuantity() > 1) {
            newQuantity = basketItem.getQuantity() - (basketItem.getQuantity() / 2);
        }
    }

    public void ThreeForThePriceOfTwoOfferCalculation(BasketItem basketItem) {
        newQuantity = basketItem.getQuantity();

        if (basketItem.getQuantity() > 2) {
            newQuantity = basketItem.getQuantity() - (basketItem.getQuantity() / 3);
        }
    }

}
