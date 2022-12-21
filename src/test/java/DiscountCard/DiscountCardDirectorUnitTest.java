package DiscountCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCardDirectorUnitTest {

    DiscountCardDirector discountCardDirector;

    @BeforeEach
    void createDiscountCardDirector() {
        discountCardDirector = new DiscountCardDirector(new ConsoleCheckDiscountCardBuilder(new String[]{"card-1111"}));
    }

    @Test
    void buildCheckDiscountCard() throws Exception {
        CheckDiscountCard checkDiscountCard = new CheckDiscountCard();
        checkDiscountCard.setDiscountCard(new DiscountCard(1111, 20));
        assertEquals(checkDiscountCard, discountCardDirector.buildCheckDiscountCard());

    }
}