package Product;

import java.util.Objects;

public abstract class CheckProductListBuilder {
    private CheckProductList checkProductList;

    public void createCheckProductList() {
        checkProductList = new CheckProductList();
    }

    public abstract void fillCheckProductList() throws Exception;

    public CheckProductList getCheckProductList() {
        return checkProductList;
    }
}
