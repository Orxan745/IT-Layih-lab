package org.example.utils;

import org.example.model.Card;
import org.example.model.Customer;
import org.example.model.Transaction;
import java.util.Random;
import static org.example.model.Bank.*;

public class StrategyUtil {
    public static String getRandomNumber(int numberLength) {
        Random random = new Random();
        int a;
        char b;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < numberLength; i++) {
            a = random.nextInt(48, 58);
            b = (char) a;
            number.append(b);
        }
        return number.toString();
    }

    public static Customer getCustomerByNo(String customerNo) {
        try {
            return customers.
                    stream().
                    filter(customer -> customer.getCustomerNo().equals(customerNo)).
                    findFirst().
                    orElseThrow(IllegalArgumentException::new);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid customer number: " + customerNo);
        }
        throw new RuntimeException();
    }

    public static Card getCardByNo(Customer customer, String cardNo) {
        try {
            return customer.getCards().
                    stream().
                    filter(card -> card.getCardNumber().equals(cardNo)).
                    findFirst().
                    orElseThrow(IllegalArgumentException::new);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid card number: " + cardNo);
        }
        throw new RuntimeException();
    }

    public static Transaction getTransactionByNo(String transactionNo) {
        try {
            return transactions.
                    stream().
                    filter(transaction -> transaction.getTransactionNo().equals(transactionNo)).
                    findFirst().
                    orElseThrow(IllegalArgumentException::new);
        }catch (IllegalArgumentException e) {
            System.out.println("Invalid transaction number: " + transactionNo);
        }
        throw new RuntimeException();
    }

    public static Double currencyTransformation(Card sender, Card receiver, Double amount) {
        Double transformedAmount = amount * sender.getCurrency().getDollarAmount();
        transformedAmount = transformedAmount / receiver.getCurrency().getDollarAmount();
        return transformedAmount;
    }
}