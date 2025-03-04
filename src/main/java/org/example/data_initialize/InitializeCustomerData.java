package org.example.data_initialize;

import org.example.model.Customer;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import static org.example.constants.FileConstants.CUSTOMER_FILE_NAME;
import static org.example.model.Bank.customers;
import static org.example.utils.FileUtils.readObjectFromFile;

public class InitializeCustomerData implements Runnable{
    @Override
    public void run() {
        try {
            Object object = readObjectFromFile(CUSTOMER_FILE_NAME);
            if (object != null) {
                customers = (ArrayList<Customer>) object;
            }
        } catch (EOFException e) {
            System.out.println("Customer file is empty!");
        } catch (IOException | ClassNotFoundException _) {}
    }
}