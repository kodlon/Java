package Lab3.Lab3_2;

public class Address {

    //Поля адреси, стандратні
    private final String mainLand;
    private final String country;
    private final String city;
    private final String street;
    private final int house;
    private final int flat;
    private final int postIndex;

    //Конструктор
    public Address(String mainLand, String country, String city, String street, int house, int flat, int postIndex) {
        this.mainLand = mainLand;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.postIndex = postIndex;
    }

    //Вивід Адреси
    public String out() {
        return mainLand + ", " +
                country + ", " +
                city + ", " +
                street + ", " +
                house + ", " +
                flat + ". \nПоштовий індекс: " +
                postIndex + '.';
    }
}
