package DiscountCard;

public abstract class CheckDiscountCardBuilder {
    private CheckDiscountCard checkDiscountCard;

    public CheckDiscountCardBuilder() {
        checkDiscountCard = new CheckDiscountCard();
    }

    public abstract void loadCheckDiscountCard() throws Exception;

    public CheckDiscountCard getCheckDiscountCard() {
        return checkDiscountCard;
    }


}
