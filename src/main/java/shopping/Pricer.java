package shopping;

import shopping.database.DiscountDao;

public class Pricer {

    private final DiscountDao discountDao;

    public Pricer(DiscountDao discountDao) {
        this.discountDao = discountDao;
    }

    public double applyDiscount(double normalPrice, long userId, long productId) {
        double discountFactor = discountDao.findDiscountFactor(userId, productId);
        return normalPrice * discountFactor;
    }

}
