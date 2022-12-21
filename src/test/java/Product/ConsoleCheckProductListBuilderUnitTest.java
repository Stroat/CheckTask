package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleCheckProductListBuilderUnitTest {

    ConsoleCheckProductListBuilder checkProductListBuilder;

    @BeforeEach
    void createCheckProductListBuilder() {
        checkProductListBuilder = new ConsoleCheckProductListBuilder(new String[]{"1-1"});
    }

    @Test
    void fillCheckProductList() throws Exception {
        Map<Product, Integer> test = new LinkedHashMap<>();
        test.put(new Product(1, 13, "Potato", false), 1);
        checkProductListBuilder.fillCheckProductList();
        assertEquals(test, checkProductListBuilder.getCheckProductList().getProductList());
    }
}