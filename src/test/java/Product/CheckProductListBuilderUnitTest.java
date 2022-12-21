package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckProductListBuilderUnitTest {

    CheckProductListBuilder checkProductListBuilder;

    CheckProductListBuilder checkProductListBuilder1;

    @BeforeEach
    void createCheckProductListBuilder() {
        checkProductListBuilder = new ConsoleCheckProductListBuilder(new String[]{"1-1"});
        checkProductListBuilder1 = new ConsoleCheckProductListBuilder(new String[]{"1-1"});

    }

    @Test
    void createCheckProductList() {
        assertEquals(checkProductListBuilder1.getCheckProductList(), checkProductListBuilder.getCheckProductList());
    }

    @Test
    void getCheckProductList() {
        assertEquals(checkProductListBuilder1.getCheckProductList(), checkProductListBuilder.getCheckProductList());
    }


}