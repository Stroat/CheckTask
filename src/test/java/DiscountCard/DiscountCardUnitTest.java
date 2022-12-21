package DiscountCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCardUnitTest {

    DiscountCard discountCard;

    @BeforeEach
    void createDiscountCard() {
        discountCard = new DiscountCard(1111, 15);
    }

    @Test
    void getCardNumber() {
        assertEquals(1111, discountCard.getCardNumber());
    }

    @Test
    void setCardNumber() {
        discountCard.setCardNumber(1234);
        assertEquals(1234, discountCard.getCardNumber());
    }

    @Test
    void getDiscountPercentage() {
        assertEquals(15, discountCard.getDiscountPercentage());
    }

    @Test
    void setDiscountPercentage() {
        discountCard.setDiscountPercentage(16);
        assertEquals(16, discountCard.getDiscountPercentage());
    }

    @Test
    void testEquals() {
        DiscountCard test = new DiscountCard(1111, 15);
        assertEquals(test, discountCard);
    }

    @Test
    void testHashCode() {
        DiscountCard test = new DiscountCard(1111, 15);
        assertEquals(test.hashCode(), discountCard.hashCode());
    }
}