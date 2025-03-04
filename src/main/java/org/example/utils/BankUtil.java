package org.example.utils;

import org.example.data_initialize.InitializeCustomerData;
import org.example.data_initialize.InitializeTransactionData;

public class BankUtil {
    public static void initializeAllData() {

        Thread customerData = new Thread(new InitializeCustomerData());

        Thread transactionData = new Thread(new InitializeTransactionData());

        customerData.start();

        transactionData.start();
    }
}