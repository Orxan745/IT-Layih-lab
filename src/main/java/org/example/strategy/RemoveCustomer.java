package org.example.strategy;

import org.example.model.Customer;
import java.util.Scanner;
import static org.example.utils.StrategyUtil.*;
import static org.example.model.Bank.*;

public class RemoveCustomer implements MenuStrategy {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the customer number: ");
        String customerNo = scanner.next();
        Customer customer = getCustomerByNo(customerNo);
        customers.remove(customer);
        System.out.println("--------------------------------------------");
        System.out.println("Customer removed successfully!");
    }
}