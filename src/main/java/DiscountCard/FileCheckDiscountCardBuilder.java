package DiscountCard;

import StringFIleReaderWriter.StringFileReader;

public class FileCheckDiscountCardBuilder extends CheckDiscountCardBuilder {
    private StringFileReader discountCardStringFileReader;
    private StringFileReader parametersStringFileReader;

    public FileCheckDiscountCardBuilder(StringFileReader discountCardStringFileReader, StringFileReader parametersStringFileReader) {
        this.discountCardStringFileReader = discountCardStringFileReader;
        this.parametersStringFileReader = parametersStringFileReader;
    }

    @Override
    public void loadCheckDiscountCard() throws Exception {
        String[] discountCards = discountCardStringFileReader.readString().split("\n");
        String[] parameters = parametersStringFileReader.readString().split("\n");

        label : for (String parameter : parameters) {
            if (parameter.contains("card")) {
                if (parameter.split("-")[0].replaceAll("card", "").length() != 0) {
                    throw new Exception(parameter + "-Incorrect card parameters");
                }
                for (String discountCard : discountCards) {
                    String[] discountCardParameters = discountCard.split(" ");
                    if (discountCardParameters[0].equals(parameter.split("-")[1])) {
                        try {
                            getCheckDiscountCard().setDiscountCard(new DiscountCard(
                                    Integer.parseInt(discountCardParameters[0]),
                                    Double.parseDouble(discountCardParameters[1])
                                    )
                            );
                        } catch (NumberFormatException e) {
                            throw new RuntimeException(parameter + "-Incorrect discountCardParameters",e);
                        }
                        break label;
                    }
                }
            }
        }
    }
}
