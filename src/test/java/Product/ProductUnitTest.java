package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductUnitTest {

    Product product;

    @BeforeEach
    void createProduct() {
        product = new Product(1, 12, "Tomato", false);
    }

    @Test
    void getId() {
        assertEquals(1, product.getId());
    }

    @Test
    void setId() {
        product.setId(2);
        assertEquals(2, product.getId());
    }

    @Test
    void getCost() {
        assertEquals(12, product.getCost());
    }

    @Test
    void setCost() {
        product.setCost(15);
        assertEquals(15, product.getCost());
    }

    @Test
    void getName() {
        assertEquals("Tomato", product.getName());
    }

    @Test
    void setName() {
        product.setName("Cheese");
        assertEquals("Cheese", product.getName());
    }

    @Test
    void isOnSale() {
        assertFalse(product.isOnSale());
    }

    @Test
    void setOnSale() {
        product.setOnSale(true);
        assertTrue(product.isOnSale());
    }

    @Test
    void testEquals() {
        Product test = new Product(1, 12, "Tomato", false);
        assertEquals(test, product);
    }

    @Test
    void testHashCode() {
        Product test = new Product(1, 12, "Tomato", false);
        assertEquals(test.hashCode(), product.hashCode());
    }
}