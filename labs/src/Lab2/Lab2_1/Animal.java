package Lab2.Lab2_1;

public abstract class Animal {
    String animalName;// Назва тварини
    int speed;//Швидкість

    public Animal(String animalName, int speed) {//Конструктор
        this.animalName = animalName;
        this.speed = speed;
    }

    public abstract boolean eat(Food food);

    public abstract void run();

}
