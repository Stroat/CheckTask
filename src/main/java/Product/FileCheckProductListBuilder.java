package Product;

import StringFIleReaderWriter.StringFileReader;

public class FileCheckProductListBuilder extends CheckProductListBuilder {
    private StringFileReader productTypesStringFileReader;
    private StringFileReader parametersStringFileReader;

    public FileCheckProductListBuilder(StringFileReader productTypesStringFileReader, StringFileReader parametersStringFileReader) {
        this.productTypesStringFileReader = productTypesStringFileReader;
        this.parametersStringFileReader = parametersStringFileReader;
    }

    @Override
    public void fillCheckProductList() throws Exception {
        String[] productTypes = productTypesStringFileReader.readString().split("\n");
        String[] parameters = parametersStringFileReader.readString().split("\n");

        for (String parameter : parameters) {
            if (!parameter.contains("card")) {
                boolean isProductExist = false;
                for (String product : productTypes) {
                    String[] productParameters = product.split(" ");
                    if (parameter.split("-")[0].equals(productParameters[0])) {
                        getCheckProductList().addProduct(new Product
                               (Integer.parseInt(productParameters[0]), Double.parseDouble(productParameters[1]),
                                productParameters[2], Boolean.parseBoolean(productParameters[3])),
                        Integer.parseInt(parameter.split("-")[1]));
                        isProductExist = true;
                        break;
                    }
                }
                if (!isProductExist) {
                    throw new Exception(parameter + "-Incorrect product parameters");
                }
            }
        }

    }
}
