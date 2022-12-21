package DiscountCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDiscountCardUnitTest {

    CheckDiscountCard checkDiscountCard;

    @BeforeEach
    void createCheckDiscountCard() {
        checkDiscountCard = new CheckDiscountCard();
        checkDiscountCard.setDiscountCard(new DiscountCard(1234, 13));
    }

    @Test
    void setDiscountCard() {
        checkDiscountCard.setDiscountCard(new DiscountCard(1111, 10));
        assertEquals(new DiscountCard(1111, 10), checkDiscountCard.getDiscountCard());
    }

    @Test
    void getDiscountCard() {
        assertEquals(new DiscountCard(1234, 13), checkDiscountCard.getDiscountCard());
    }

    @Test
    void testEquals() {
        CheckDiscountCard checkDiscountCard1 = new CheckDiscountCard();
        checkDiscountCard1.setDiscountCard(new DiscountCard(1234,13));
        assertEquals(checkDiscountCard1, checkDiscountCard);
    }

    @Test
    void testHashCode() {
        CheckDiscountCard checkDiscountCard1 = new CheckDiscountCard();
        checkDiscountCard1.setDiscountCard(new DiscountCard(1234,13));
        assertEquals(checkDiscountCard1.hashCode(), checkDiscountCard.hashCode());
    }

}