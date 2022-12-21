import DiscountCard.CheckDiscountCard;
import DiscountCard.DiscountCard;
import Product.CheckProductList;
import Product.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckUnitTest {

    Check check;

    @BeforeEach
    void create() {
        CheckDiscountCard checkDiscountCard = new CheckDiscountCard();
        checkDiscountCard.setDiscountCard(new DiscountCard(1111, 10));
        CheckProductList checkProductList = new CheckProductList();
        checkProductList.addProduct(new Product(1, 13, "Tomato", true), 1);
        check = new Check(checkProductList, checkDiscountCard);
    }

    @Test
    void createCheck() {
        String result = "1 Tomato 13.0\nSum is: 13.0\nDiscount is: 10.0%\nTotal cost is: 11.7";
        check.createCheck();
        assertEquals(result, check.getCheckResult());
    }

    @Test
    void getCheckResult() {
        check.createCheck();
        String result = "1 Tomato 13.0\nSum is: 13.0\nDiscount is: 10.0%\nTotal cost is: 11.7";
        assertEquals(result, check.getCheckResult());
    }
}