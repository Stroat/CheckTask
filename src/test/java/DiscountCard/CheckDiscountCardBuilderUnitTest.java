package DiscountCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDiscountCardBuilderUnitTest {

    CheckDiscountCardBuilder checkDiscountCardBuilder;

    @BeforeEach
    void createCheckDiscountCardBuilder() throws Exception {
        checkDiscountCardBuilder = new ConsoleCheckDiscountCardBuilder(new String[]{"card-1111"});
        checkDiscountCardBuilder.loadCheckDiscountCard();

    }

    @Test
    void getCheckDiscountCard() {
        CheckDiscountCard checkDiscountCard = new CheckDiscountCard();
        checkDiscountCard.setDiscountCard(new DiscountCard(1111, 20));
        assertEquals(checkDiscountCard, checkDiscountCardBuilder.getCheckDiscountCard());
    }
}