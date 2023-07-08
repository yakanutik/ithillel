package org.example.homeTasks.eight.four;

public class DepositService {
    public void refill(Account account, double amount) {
        account.getBill().setAmount(account.getBill().getAmount() + amount);
        System.out.println("Refilled account with " + amount);
    }
}