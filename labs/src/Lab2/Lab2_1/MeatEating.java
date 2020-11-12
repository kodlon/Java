package Lab2.Lab2_1;

public class MeatEating extends Animal {
    String outWard;//Зовнішній вигляд

    public MeatEating(String animalName, int speed, String outWard) {//Конструктор
        super(animalName, speed);
        this.outWard = outWard;
    }

    @Override
    public boolean eat(Food food) {//Перевірка на їжу
        System.out.print("Чи їсть " + animalName + " такий продукт як " + food.foodName + "? ");
        return food instanceof Meat;
    }

    @Override
    public void run() {//Вивід швидкості
        System.out.println(animalName + " - " + "Цей " + outWard +
                " хижак біжить із швидкістю " + speed + " м/с. ");
    }
}
