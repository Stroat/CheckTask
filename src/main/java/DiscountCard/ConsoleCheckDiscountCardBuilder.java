package DiscountCard;

import java.util.ArrayList;
import java.util.List;

public class ConsoleCheckDiscountCardBuilder extends CheckDiscountCardBuilder {

    private static List<DiscountCard> discountCardList = new ArrayList<>();
    static {
        discountCardList.add(new DiscountCard(1234, 15));
        discountCardList.add(new DiscountCard(1111, 20));
        discountCardList.add(new DiscountCard(4444, 40));
    }

    private String[] consoleArguments;

    public ConsoleCheckDiscountCardBuilder(String[] consoleArguments) {
        this.consoleArguments = consoleArguments;
    }

    @Override
    public void loadCheckDiscountCard() throws Exception {
        DiscountCard discountCard = null;
        label : for (String argument : consoleArguments) {
            if (argument.contains("card")) {
                if (argument.split("-")[0].replaceAll("card", "").length() != 0) {
                    throw new Exception(argument + "-Incorrect discount card");
                }
                boolean isCardExist = false;
                for (DiscountCard DC : discountCardList) {
                    try {
                        if (String.valueOf(DC.getCardNumber()).equals(argument.split("-")[1])) {
                            discountCard = DC;
                            break label;
                        }
                    } catch (Exception e) {
                        throw new Exception(argument + "-Incorrect discount card", e);
                    }
                }
                if (!isCardExist) {
                    throw new Exception(argument + "-Incorrect discount card");
                }
            }
        }
        getCheckDiscountCard().setDiscountCard(discountCard);
    }
}
