package org.example.strategy;

import java.util.Scanner;
import static org.example.model.Bank.*;

public class ShowAllCustomerTransactions implements MenuStrategy{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the customer number: ");
        String customerNo = scanner.next();
        transactions.
                stream().
                filter(transaction -> transaction.getSenderNumber().equals(customerNo)).
                map(transaction -> {
                    System.out.println(transaction);
                    System.out.println();
                    return transaction;
                }).
                toList().
                stream().
                findAny().
                orElseThrow(IllegalArgumentException::new);
    }
}