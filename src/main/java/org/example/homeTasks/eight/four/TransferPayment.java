package org.example.homeTasks.eight.four;

public class TransferPayment {
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBill().getAmount() >= amount) {
            fromAccount.getBill().setAmount(fromAccount.getBill().getAmount() - amount);
            toAccount.getBill().setAmount(toAccount.getBill().getAmount() + amount);
            System.out.println("Transferred " + amount);
        } else {
            System.out.println("Insufficient funds in account " );
        }
    }
}