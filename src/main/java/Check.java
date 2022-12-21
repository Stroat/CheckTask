import DiscountCard.DiscountCard;
import Product.CheckProductList;
import Product.Product;
import DiscountCard.CheckDiscountCard;

import java.util.Map;

public class Check {
    private CheckProductList checkProductList;
    private CheckDiscountCard discountCard;
    private String checkResult;

    public Check(CheckProductList checkProductList, CheckDiscountCard discountCard) {
        this.checkProductList = checkProductList;
        this.discountCard = discountCard;
    }

    public void createCheck() {
        StringBuilder result = new StringBuilder();
        double resultSum = 0;
        for (Map.Entry<Product, Integer> product : checkProductList.getProductList().entrySet()) {
            double sum = product.getKey().getCost() * product.getValue();
            if (product.getKey().isOnSale() && product.getValue() > 5) {
                sum = sum - (sum / 100 * 15);
            }
            result.append(product.getValue()).append(" ").append(product.getKey().getName()).append(" ").append(sum).append("\n");
            resultSum += sum;
        }
        if (discountCard.getDiscountCard() != null) {
            result.append("Sum is: ").append(resultSum).append("\n");
            result.append("Discount is: ").append(discountCard.getDiscountCard().getDiscountPercentage()).append("%").append("\n");
            resultSum = resultSum - (resultSum / 100 * discountCard.getDiscountCard().getDiscountPercentage());
        }
        result.append("Total cost is: ").append(resultSum);
        checkResult = result.toString();
    }

    public String getCheckResult() {
        return checkResult;
    }
}
