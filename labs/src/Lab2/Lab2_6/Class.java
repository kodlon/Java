/*---------------------------------------------------------
Завдання № 6.
Створити Map використовуючи як ключ ім’я користувача
(User із лабораторної роботи №1), а значення - об’єкт User.
Продемонструвати додавання, видалення та додавання
різних об’єктів з однаковим ключем.
---------------------------------------------------------*/


package Lab2.Lab2_6;

import Lab1.User;

import java.util.*;

public class Class {
    public static void main(String[] args) {
        Map<String, User> user = new HashMap<>();//Створення мапи
        Map<String, ArrayList<User>> userList = new HashMap<>();//Створення мапи з масивом об'єктів
        User igor = new User("Igor");//Створення юзерів
        User mike = new User("Mike");

        userList.put(igor.getFirstName(), new ArrayList<>());//Створення списку під ключ
        userList.get(igor.getFirstName()).add(igor);//Заповенння масиву
        userList.get(igor.getFirstName()).add(mike);

        userList.put(mike.getFirstName(), new ArrayList<>());//Створрення списку за іншим ключем
        userList.get(mike.getFirstName()).add(igor);//його заповнення

        System.out.println(userList.get(igor.getFirstName()).get(0).getFirstName());//Вивід цих двох списків
        System.out.println(userList.get(mike.getFirstName()).get(0).getFirstName());
        System.out.println(userList.get(igor.getFirstName()).get(1).getFirstName());

        System.out.println();
        user.put(igor.getFirstName(), igor);//Заповнення мапи з одним ключем
        System.out.println(user.get(igor.getFirstName()).getFirstName());

        user.put(igor.getFirstName(), mike);//Заповнення мапи з одним ключем, але іншим об'єктом
        System.out.println(user.get(igor.getFirstName()).getFirstName());

        user.remove(igor.getFirstName());//Видалення з мапи за ключем
        System.out.println(user.get(igor.getFirstName()));
    }
}
