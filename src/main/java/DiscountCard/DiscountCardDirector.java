package DiscountCard;

public class DiscountCardDirector {
    private CheckDiscountCardBuilder checkDiscountCardBuilder;

    public DiscountCardDirector(CheckDiscountCardBuilder checkDiscountCardBuilder) {
        this.checkDiscountCardBuilder = checkDiscountCardBuilder;
    }

    public CheckDiscountCard buildCheckDiscountCard() throws Exception {
        checkDiscountCardBuilder.loadCheckDiscountCard();
        return checkDiscountCardBuilder.getCheckDiscountCard();
    }

}
