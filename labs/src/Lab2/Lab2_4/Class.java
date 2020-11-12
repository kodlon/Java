/*--------------------------------------
Завдання № 4.
Продемонструвати поліморфізм
із першого завдання використовуючи List.
--------------------------------------*/

package Lab2.Lab2_4;

import Lab2.Lab2_1.*;//Імпорт завдання

import java.util.ArrayList;//Бібліотека для списку

public class Class {
    public static void main(String[] args) {
        ArrayList<Animal> meatEating = new ArrayList<>();//список
        Animal tiger = new MeatEating("Тигр", 20, "білий");//Об'єкти
        Animal human = new MeatEating("Ігор", 14, "голодний");

        meatEating.add(tiger);//Заповнення списку
        meatEating.add(human);
        meatEating.add(new MeatEating("Лев", 18, "здоровий"));//Заповнення + створення

        meatEating.get(0).run();//Метод виводу бігу
        meatEating.get(1).run();
        meatEating.get(2).run();
    }
}
