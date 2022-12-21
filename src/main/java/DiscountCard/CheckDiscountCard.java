package DiscountCard;

import java.util.Objects;

public class CheckDiscountCard {
    private DiscountCard discountCard;

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckDiscountCard that = (CheckDiscountCard) o;
        return Objects.equals(discountCard, that.discountCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountCard);
    }
}
