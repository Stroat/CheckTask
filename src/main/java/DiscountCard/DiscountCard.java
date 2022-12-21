package DiscountCard;

import java.util.Objects;

public class DiscountCard {
    private int cardNumber;
    private double discountPercentage;

    public DiscountCard(int cardNumber, double discountPercentage) {
        this.cardNumber = cardNumber;
        this.discountPercentage = discountPercentage;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountCard that = (DiscountCard) o;
        return cardNumber == that.cardNumber && Double.compare(that.discountPercentage, discountPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, discountPercentage);
    }
}
