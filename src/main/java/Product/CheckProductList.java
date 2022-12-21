package Product;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CheckProductList {
    private Map<Product, Integer> productList;

    public CheckProductList() {
        productList = new LinkedHashMap<>();
    }

    public void addProduct(Product product, int amount) {
        if (productList.containsKey(product)) {
            amount += productList.get(product);
        }
        productList.put(product, amount);
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckProductList that = (CheckProductList) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }
}
