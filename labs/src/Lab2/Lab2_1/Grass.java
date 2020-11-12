package Lab2.Lab2_1;

public class Grass extends Food {
    String foodSize;//Розмір їжі

    public Grass(String foodName, String foodSize) {//Конструктор
        super(foodName);
        this.foodSize = foodSize;
    }
}
