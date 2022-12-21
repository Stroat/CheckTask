package Product;

public class ProductDirector {
    private CheckProductListBuilder checkProductListBuilder;

    public ProductDirector(CheckProductListBuilder checkProductListBuilder) {
        this.checkProductListBuilder = checkProductListBuilder;
    }

    public CheckProductList buildCheckProductList() throws Exception {
        checkProductListBuilder.createCheckProductList();
        checkProductListBuilder.fillCheckProductList();
        return checkProductListBuilder.getCheckProductList();
    }

}
