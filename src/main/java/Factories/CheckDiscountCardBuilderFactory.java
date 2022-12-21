package Factories;

import DiscountCard.CheckDiscountCardBuilder;
import DiscountCard.ConsoleCheckDiscountCardBuilder;
import DiscountCard.FileCheckDiscountCardBuilder;
import StringFIleReaderWriter.StringFileReader;

public class CheckDiscountCardBuilderFactory {
    private String[] arguments;

    public CheckDiscountCardBuilderFactory(String[] arguments) {
        this.arguments = arguments;
    }

    public CheckDiscountCardBuilder createCheckDiscountCardBuilder() throws Exception {
        CheckDiscountCardBuilder checkDiscountCardBuilder;
        if (arguments[0].equals("console")) {
            checkDiscountCardBuilder = new ConsoleCheckDiscountCardBuilder(arguments);
        } else if (arguments[0].equals("file")) {
            checkDiscountCardBuilder = new FileCheckDiscountCardBuilder(
                    new StringFileReader(getClass().getResource("/").getPath() + "..\\resources\\DiscountCards.txt"),
                    new StringFileReader(arguments[1])
            );
        } else {
            throw new Exception(arguments[0] + "- Incorrect command");
        }
        return checkDiscountCardBuilder;
    }
}
