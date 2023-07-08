package org.example.homeTasks.seven.four;

public class Service {
    public void transferFrom(Person person1, Person person2, double amount) {
        Bill account1 = person1.getAccount();
        Bill account2 = person2.getAccount();
        double currentAmount1 = account1.getAmount();
        if (currentAmount1 < amount) {
            System.out.println("Not enough money to make transfer.");
        } else {
            double currentAmount2 = account2.getAmount();
            account1.setAmount(currentAmount1 - amount);
            account2.setAmount(currentAmount2 + amount);
            System.out.println("Successfully transferred " + amount + " from " + person1.getName() + " to " + person2.getName() + ".");
        }
    }

    public void refill(Person person, double amount) {
        Bill account = person.getAccount();
        account.setAmount(account.getAmount() + amount);
        System.out.println("Successfully refill: " + amount);
        checkAccountStatusBy(person, "AFTER transaction");
    }

    public void withdrawal(Person person, double amount) {
        Bill account = person.getAccount();
        if (account.getAmount() >= amount) {
            account.setAmount(account.getAmount() - amount);
            System.out.println("Successfully withdrawal: " + amount);
        } else {
            System.out.println("Insufficient money");
            checkAccountStatusBy(person);
        }
        checkAccountStatusBy(person, "AFTER transaction");
    }

    public void checkAccountStatusBy(Person person) {
        String name = person.getName();
        double currentAmount = person.getAccount().getAmount();
        System.out.println(name + "'s account balance: $" + currentAmount);
    }

    public void checkAccountStatusBy(Person person, String message) {
        String name = person.getName();
        double currentAmount = person.getAccount().getAmount();
        System.out.println(name + "'s account balance " + message + ": $" + currentAmount);
    }
}