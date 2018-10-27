package shopping.database;

public class DiscountDao {

    // Dans une implémentation d'une vraie application,
    // la méthode se connecterait à une base de données
    // et retournerait le discount factor
    public double findDiscountFactor(long userId, long productId) {
        sleepMiliSecond(700);

        if(userId == 2 && productId == 10) {
            return 0.85;
        }

        return 1;
    }

    private void sleepMiliSecond(int sleepLength) {
        try {
            Thread.sleep(sleepLength);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
