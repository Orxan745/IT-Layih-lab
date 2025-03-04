package org.example.strategy;

import org.example.model.Customer;
import java.util.Scanner;
import static org.example.model.Bank.*;
import static org.example.utils.StrategyUtil.*;

public class CreateCustomer implements MenuStrategy {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the customer: ");
        String name = scanner.next();
        System.out.print("Please enter the surname of the customer: ");
        String surname = scanner.next();
        Customer customer = new Customer(name, surname);
        customer.setCustomerNo(getRandomNumber(7));
        customers.add(customer);
        System.out.println("Customer number: " + customer.getCustomerNo());
    }
}