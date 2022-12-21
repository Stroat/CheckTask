package Product;

import java.util.ArrayList;
import java.util.List;



public class ConsoleCheckProductListBuilder extends CheckProductListBuilder {
    private static List<Product> productTypes = new ArrayList<>();
    static {
        productTypes.add(new Product(1, 13, "Potato", false));
        productTypes.add(new Product(2,16, "Chips", true));
        productTypes.add(new Product(3, 14, "Tomato", false));
        productTypes.add(new Product(4, 17, "Cola", true));

    }

    private String[] consoleArguments;



    public ConsoleCheckProductListBuilder(String[] consoleArguments) {
        this.consoleArguments = consoleArguments;
        createCheckProductList();
    }

    @Override
    public void fillCheckProductList() throws Exception {
        for (String argument : consoleArguments) {
            String[] arguments = argument.split("-");
            if (!argument.contains("console") && !argument.contains("card")) {
                try {
                    int id = Integer.parseInt(arguments[0]);
                    boolean isIdExist = false;
                    for (Product product : productTypes) {
                        if (product.getId() == id) {
                            isIdExist = true;
                            getCheckProductList().addProduct(product, Integer.parseInt(arguments[1]));
                        }
                    }
                    if (!isIdExist) {
                        throw new Exception(argument + "-Incorrect product parameters");
                    }
                } catch (Exception e) {
                    throw new Exception(argument + "-Incorrect product parameters", e);
                }
            }
        }
    }


}
