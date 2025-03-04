package org.example.strategy;

import org.example.enums.CardStatus;
import org.example.enums.Currency;
import org.example.model.Card;
import org.example.model.Customer;
import java.util.Scanner;
import static org.example.utils.StrategyUtil.*;
import static org.example.utils.MenuUtil.*;

public class CreateCard implements MenuStrategy {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the customer number: ");
        String customerNo = scanner.next();
        Customer customer = getCustomerByNo(customerNo);
        showCurrencies();
        System.out.print("Please select a currency: ");
        int value = scanner.nextInt();
        Currency currency = getCurrencyByValue(value);
        Card card = new Card(getRandomNumber(16), currency,0D, CardStatus.ACTIVE);
        System.out.println("Card number: "+ card.getCardNumber());
        customer.getCards().add(card);
    }
}