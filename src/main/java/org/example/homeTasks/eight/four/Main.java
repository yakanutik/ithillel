package org.example.homeTasks.eight.four;


public class Main {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan", "Ivanov", "ivan@google.com", "673376688");
        Person daria = new Person("Daria", "Dantsova", "daria@google.com", "0507771122");

        Bill credit = new Bill(1000.0);
        Bill debit = new Bill(2000.0);

        Account main = new Account(credit, ivan);
        Account additional = new Account(debit, daria);

        PaymentService alfaBank = new PaymentService();
        DepositService depositService = new DepositService();
        TransferPayment transferPayment = new TransferPayment();

        // payment from main
        alfaBank.makePayment(main, 500.0);

        // Refill additional
        depositService.refill(additional, 500.0);

        // Transfer from main to additional
        transferPayment.transfer(main, additional, 300.0);
    }
}
