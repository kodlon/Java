package Lab2.Lab2_1;

public class Meat extends Food {
    String foodSize;//Розмір їжі

    public Meat(String foodName, String foodSize) {//Конструктор
        super(foodName);
        this.foodSize = foodSize;
    }
}
