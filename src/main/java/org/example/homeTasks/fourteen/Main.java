package org.example.homeTasks.fourteen;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Roman", "Shukhevych", 43, "Roman.Shukhevych@gmail.com"));
        userList.add(new User("Stepan", "Bandera", 50, "Stepan.Bandera@gmail.com"));
        userList.add(new User("Petro", "Kalnyshevsky", 44, "Petro.Kalnyshevsky@gmail.com"));
        userList.add(new User("Ivan", "Vyshnevsky", 24, "Ivan.Vyshnevsky@gmail.com"));
        userList.add(new User("Levko", "Lukyanenko", 90, "Levko.Lukyanenko@gmail.com"));
        userList.add(new User("Levko", "Lukyanenko", 90, "Levko.Lukyanenko@gmail.com"));
        userList.add(new User("Vasyl", "Levkovich", 44, "Vasyl.Levkovich@gmail.com"));
        userList.add(new User("Serhiy", "Nigoyan", 22, "Serhiy.Nigoyan@gmail.com"));
        userList.add(new User("Vasyl", "Slipak", 42, "Vasyl.Slipak@gmail.com"));
        userList.add(new User("Nadia", "Savchenko", 41, "Nadia.Savchenko@gmail.com"));


        // ----------------- (1) -----------------
        // Sorted by age and display unique last names
        List<String> uniqueLastNames = userList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .map(User::getSurname)
                .distinct()
                .collect(Collectors.toList());

        // Display the unique last names on the screen
        System.out.println("1) Print unique last names and sorted by age :");
        for (String lastName : uniqueLastNames) {
            System.out.println(lastName);
        }

        // -----------------  (2) -----------------
        // Filter by last name length, get the first result
        Optional<String> firstNameWithShortLastName = userList.stream()
                .filter(user -> user.getSurname().length() < 8)
                .map(User::getName)
                .findFirst();

        // Display the result or throw an exception if not found
        System.out.println("2) Print findFirst result and filtered by last name length:");
        if (firstNameWithShortLastName.isPresent()) {
            System.out.println(firstNameWithShortLastName.get());
        } else {
            throw new RuntimeException("No user with a short last name found.");
        }

        // ----------------- (3) -----------------
        // Filter by email length and remove the first 3 results
        List<User> filteredList = userList.stream()
                .filter(user -> user.getEmail().length() >= 10)
                .skip(3)
                .collect(Collectors.toList());

        // Display the birth year of the remaining users
        List<Integer> birthYears = filteredList.stream()
                .map(user -> user.getAge() - LocalDate.now().getYear())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        // Sort the birth years in descending order
        // Display the birth years
        System.out.println("3) Print only the year of birth of users from the sorted list: ");
        for (int birthYear : birthYears) {
            System.out.println(birthYear);
        }
    }
    // ----------------- (4) -----------------
/*
1) Рекурсія — це техніка програмування, коли метод або функція викликає саму себе неодноразово,
 доки не досягне базового випадку.
Простіше кажучи, це спосіб вирішити проблему, розбиваючи її на менші подібні підпроблеми.

2) Stream and Optional: обидві функції, представлені в Java 8 для покращення функціональних можливостей програмування мови.

Stream: це абстракція, яка представляє послідовність елементів і підтримує такі операції функціонального стилю,
 як фільтрація, відображення, скорочення тощо.
Це дозволяє обробляти колекції (масиви, списки тощо) декларативним і стисло за допомогою лямбда-виразів.

Optional: це клас, представлений у Java 8 для вирішення проблеми значень із null і зменшення NullPointerExceptions.
 Він або містить non-null значення, або вказує на відсутність значення.
 Його зазвичай використовують, щоб уникнути явних перевірок для null.

Підсумовуючи, Stream використовується для виконання операцій функціонального стилю над послідовностями елементів,
тоді як Optional допомагає обробляти наявність або відсутність значень більш елегантним і безпечним способом.
*/
}

