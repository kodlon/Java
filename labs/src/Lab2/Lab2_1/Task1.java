/*--------------------------------------------------------
Завдання № 1.
Реалізувати ієрархію класів Тварини(Animal) та Їжа (Food).
Твариниподіляються на травоїдних та м’ясоїдних.
Їжа поділяється відповідно.
--------------------------------------------------------*/


package Lab2.Lab2_1;

public class Task1 {
    public static void main(String[] args) {
        MeatEating tiger = new MeatEating("Тигр", 15, "гарний");//Створення нового об'єкту, тварини
        GrassEating rabbit = new GrassEating("Заєць", 18, "біла");

        Meat meat = new Meat("Яловична", "велика");//Створення нового об'єкту, їжі
        Grass grass = new Grass("Морква", "маленька");

        MeatEating[] arrayAnimal = new MeatEating[2];//Створення масиву об'єктів, тварин

        arrayAnimal[0] = new MeatEating("Вовк", 13, "сірий");//Заповнення масиву
        arrayAnimal[1] = new MeatEating("Студент", 999, "дикий");


        System.out.println(tiger.eat(meat));//Перевірка чи тварина зможе їсти, задану їжу
        System.out.println(tiger.eat(grass));
        System.out.println();

        System.out.println(rabbit.eat(meat));
        System.out.println(rabbit.eat(grass));
        System.out.println();

        tiger.run();//Метод для виводу швидкості
        rabbit.run();

        arrayAnimal[0].run();//Виведення швидкості для масиву
        arrayAnimal[1].run();
    }
}
