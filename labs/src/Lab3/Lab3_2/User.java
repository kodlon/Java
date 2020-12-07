package Lab3.Lab3_2;

public class User {

    //Поля класу юзер, Фамілія, Ім'я, По батькові, Вік, Адерсса
    public final String surName;
    public final String fistName;
    public final String middleName;
    public final int age;
    public final Address address;

    //Конструктор
    public User(String surName, String fistName, String middleName, int age, Address address) {
        this.surName = surName;
        this.fistName = fistName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    //Вивід
    public void out() {
        System.out.println("Фамілія: " + surName
                + '\n'
                + "Ім'я: " + fistName
                + '\n'
                + "По батькові: " + middleName
                + '\n'
                + "Вік: " + age
                + '\n'
                + "Адреса: " + address.out());
    }
}
