package org.example.homeTasks.eight.four;

public class PaymentService {
    public void makePayment(Account account, double amount) {
        if (account.getBill().getAmount() >= amount) {
            account.getBill().setAmount(account.getBill().getAmount() - amount);
            System.out.println("Payment of " + amount + " successfully  ");
        } else {
            System.out.println("Insufficient funds in account ");
        }
    }
}