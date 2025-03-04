package org.example.strategy;

import java.util.Scanner;
import org.example.model.Customer;
import static org.example.utils.StrategyUtil.*;

public class ShowAllCards implements MenuStrategy{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the customer number: ");
        String customerNo = scanner.next();
        Customer customer = getCustomerByNo(customerNo);
        System.out.println("--------------------------------------------");
        customer.getCards().forEach(card -> {
            System.out.println(card);
            System.out.println();
        });
    }
}