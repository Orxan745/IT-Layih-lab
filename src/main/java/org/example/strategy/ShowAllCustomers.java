package org.example.strategy;

import static org.example.model.Bank.*;

public class ShowAllCustomers implements MenuStrategy {
    @Override
    public void execute() {
        System.out.println("--------------------------------------------");
        customers.forEach(customer -> {
            System.out.println(customer);
            System.out.println();
        });
    }
}