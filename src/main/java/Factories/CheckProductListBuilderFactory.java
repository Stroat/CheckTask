package Factories;

import Product.CheckProductListBuilder;
import Product.ConsoleCheckProductListBuilder;
import Product.FileCheckProductListBuilder;
import StringFIleReaderWriter.StringFileReader;

public class CheckProductListBuilderFactory {
    private String[] arguments;

    public CheckProductListBuilderFactory(String[] arguments) {
        this.arguments = arguments;
    }

    public CheckProductListBuilder createCheckProductListBuilder() throws Exception {
        CheckProductListBuilder checkProductListBuilder;
        if (arguments[0].equals("console")) {
            checkProductListBuilder = new ConsoleCheckProductListBuilder(arguments);
        } else if (arguments[0].equals("file")) {
            checkProductListBuilder = new FileCheckProductListBuilder(
                    new StringFileReader(getClass().getResource("/").getPath() + "..\\resources\\ProductTypes.txt"),
                    new StringFileReader(arguments[1]));
        } else {
            throw new Exception(arguments[0] + "- Incorrect command");
        }
        return checkProductListBuilder;
    }
}
