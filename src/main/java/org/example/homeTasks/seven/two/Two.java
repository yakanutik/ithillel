package org.example.homeTasks.seven.two;

public class Two {
    public static void main(String[] args) {
        C c = new C();
        c.print();
    }
}
/*
У цьому прикладі клас А -це батьківський клас з оголошеним методом print. Клас В наслідує клас А з override методом print. Клас С наслідує клас В і також override
метод print. За рахунок використання super для методу print в кожному наступному класі, при виклику print в main method відбувається покроковий перехід за схемою наслідування
виконується спочатку print класу А, потім В, а потім вже С.
 */