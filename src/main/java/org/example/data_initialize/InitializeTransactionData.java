package org.example.data_initialize;

import org.example.model.Transaction;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import static org.example.constants.FileConstants.TRANSACTION_FILE_NAME;
import static org.example.model.Bank.transactions;
import static org.example.utils.FileUtils.readObjectFromFile;

public class InitializeTransactionData implements Runnable{
    @Override
    public void run() {
        try {
            Object object = readObjectFromFile(TRANSACTION_FILE_NAME);
            if (object != null) {
                transactions = (ArrayList<Transaction>) object;
            }
        } catch (EOFException e) {
            System.out.println("Transaction file is empty!");
        } catch (IOException | ClassNotFoundException _) {}
    }
}