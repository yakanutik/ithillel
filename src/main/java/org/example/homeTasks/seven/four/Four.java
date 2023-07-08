package org.example.homeTasks.seven.four;

public class Four {
    public static void main(String[] args) {
        // create Bill objects with initial amounts
        Bill mykolaBill = new Bill(0);
        Bill elenaBill = new Bill(0);

        // create Person objects with Bills
        Person mykola = new Person("Mykola", mykolaBill);
        Person elena = new Person("Elena", elenaBill);

        // create Service object
        Service monoBank = new Service();

        //Testing:
        // test refill method
        monoBank.refill(mykola, 5000.0);
        // test withdraw method with Insufficient funds
        monoBank.withdrawal(mykola, 6000.0);
        // test withdraw method
        monoBank.withdrawal(mykola, 600.0);
        // test checkAccount method
        monoBank.checkAccountStatusBy(mykola);
        // test transferFrom method with Not enough funds
        monoBank.transferFrom(mykola, elena, 6000);
        // test transferFrom method
        monoBank.transferFrom(mykola, elena, 600);
        monoBank.checkAccountStatusBy(elena);
    }
}
