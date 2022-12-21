package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CheckProductListUnitTest {

    CheckProductList checkProductList;

    static Product product = new Product(1, 14, "Da", false);

    @BeforeEach
    void createProductList() {
        checkProductList = new CheckProductList();
        checkProductList.addProduct(product, 1);
    }

    @Test
    void addProduct() {
        Map<Product, Integer> test = new LinkedHashMap<>();
        test.put(product, 2);
        checkProductList.addProduct(product, 1);
        assertEquals(test, checkProductList.getProductList());
    }

    @Test
    void getProductList() {
        Map<Product, Integer> test = new LinkedHashMap<>();
        test.put(product, 1);
        assertEquals(test, checkProductList.getProductList());

    }

    @Test
    void testEquals() {
        CheckProductList ch;
        ch = new CheckProductList();
        ch.addProduct(product, 1);
        assertEquals(checkProductList, ch);
    }

    @Test
    void testHashCode() {
        CheckProductList ch;
        ch = new CheckProductList();
        ch.addProduct(product, 1);
        assertEquals(checkProductList.hashCode(), ch.hashCode());
    }
}