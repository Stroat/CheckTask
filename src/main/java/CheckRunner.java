
import Factories.CheckDiscountCardBuilderFactory;
import Factories.CheckProductListBuilderFactory;
import Product.ProductDirector;
import DiscountCard.DiscountCardDirector;
import StringFIleReaderWriter.StringFileWriter;


public class CheckRunner {

    public static void main(String[] args) {
        CheckProductListBuilderFactory checkProductListBuilderFactory = new CheckProductListBuilderFactory(args);
        CheckDiscountCardBuilderFactory checkDiscountCardBuilderFactory = new CheckDiscountCardBuilderFactory(args);

        ProductDirector productDirector;
        DiscountCardDirector discountCardDirector;
        try {
            productDirector = new ProductDirector(
                    checkProductListBuilderFactory.createCheckProductListBuilder()
            );
            discountCardDirector = new DiscountCardDirector(
                    checkDiscountCardBuilderFactory.createCheckDiscountCardBuilder()
            );
            Check check = new Check(productDirector.buildCheckProductList() , discountCardDirector.buildCheckDiscountCard());
            check.createCheck();
            if (args[0].equals("console")) {
                System.out.println(check.getCheckResult());
            } else if (args[0].equals("file")) {
                StringFileWriter stringFileWriter = new StringFileWriter(args[1]);
                stringFileWriter.writeString(check.getCheckResult());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
