/*
Завдання No 7.
Реалізувати клас User з полями firstName, lastName, age та email.
Перевизначити стандартні методи equals() та hashCode();
*/

package Lab1;

public class Task7 {
    public static void main(String[] args) {
        User user1 = new User("Igor"); //створення об'єктів
        User user2 = new User("Igor");
        User user3 = new User("Ivan");

        user1.setLastname("Banana"); //задання значень об'єктам
        user2.setLastname("Pomidor");
        user3.setAge(15);

        System.out.println(user1.getLastname()); //вивід
        System.out.println(user3.getAge());
        System.out.println(user1.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
    }
}
