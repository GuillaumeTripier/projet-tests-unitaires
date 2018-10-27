package shopping;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import shopping.database.DiscountDao;

public class PricerTest {

    @Test
    public void should_apply_discount_factor() {

        // GIVEN

        // Database Access Object (DAO)
        // qui se connecte à une base de données
        DiscountDao discountDao = new DiscountDao();

        Pricer pricer = new Pricer(discountDao);

        long userId = 2;
        long productId = 10;
        double normalPrice = 10;

        // WHEN
        double priceWithDiscount =
                pricer.applyDiscount(normalPrice
                                   , userId
                                   , productId
                                    );

        // THEN
        Assertions.assertThat(priceWithDiscount)
                  .isEqualTo(8.5);

    }

    @Test
    public void should_apply_discount_factor_using_anonymus_function_for_test_double() {

        // GIVEN
        DiscountDao discountDao = new DiscountDao(){
            @Override
            public double findDiscountFactor(long userId, long productId) {
                return 0.85;
            }
        };

        Pricer pricer = new Pricer(discountDao);

        long userId = 2;
        long productId = 10;
        double normalPrice = 10;

        // WHEN
        double priceWithDiscount =
                pricer.applyDiscount(normalPrice
                                   , userId
                                   , productId
                                    );

        // THEN
        Assertions.assertThat(priceWithDiscount)
                  .isEqualTo(8.5);

    }

    @Test
    public void should_apply_discount_factor_using_mockito_for_test_double() {

        // GIVEN
        DiscountDao discountDao = Mockito.mock(DiscountDao.class);
        Mockito.when(
                discountDao.findDiscountFactor(
                        Mockito.anyLong(),
                        Mockito.anyLong()
                    )
            ).thenReturn(0.85);

        Pricer pricer = new Pricer(discountDao);

        long userId = 2;
        long productId = 10;
        double normalPrice = 10;

        // WHEN
        double priceWithDiscount =
                pricer.applyDiscount(normalPrice
                                   , userId
                                   , productId
                                    );

        // THEN
        Assertions.assertThat(priceWithDiscount)
                  .isEqualTo(8.5);

    }
    @Test
    public void should_apply_discount_factor_using_mockito_verify_for_test_double() {

        // GIVEN
        DiscountDao discountDao = Mockito.mock(DiscountDao.class);

        Pricer pricer = new Pricer(discountDao);

        long userId = 2;
        long productId = 10;
        double normalPrice = 10;

        // WHEN
        pricer.applyDiscount(normalPrice
                , userId
                , productId
        );

        // THEN
        ArgumentCaptor<Long> longArgumentCaptor1 = ArgumentCaptor.forClass(Long.class);
        ArgumentCaptor<Long> longArgumentCaptor2 = ArgumentCaptor.forClass(Long.class);
        Mockito.verify(discountDao).findDiscountFactor(longArgumentCaptor1.capture(),
                longArgumentCaptor2.capture());
        Long valueOfUserId = longArgumentCaptor1.getValue();
        Long valueOfProductId = longArgumentCaptor2.getValue();
        Assertions.assertThat(valueOfUserId).isEqualTo(userId);
        Assertions.assertThat(valueOfProductId).isEqualTo(productId);

    }

}