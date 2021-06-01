package lesson_5;

import java.util.stream.IntStream;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private void info() {
        System.out.println("ИНФОРМАЦИЯ О СОТРУДНИКЕ:");
        System.out.println("Имя: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("E-Mail: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("");

    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "novikova@italmond.ru",
                "+79261478954", 30000, 33);
        persArray[1] = new Person("Petrov Petr", "Engineer", "antonianolga@mail.ru",
                "+79265478963", 45000, 25);
        persArray[2] = new Person("Sidorov Sidor", "Engineer", "cherry-lora@ya.ru",
                "+79264785126", 20000, 51);
        persArray[3] = new Person("Bobrov Ivan", "Engineer", "panferova.e67@mail.ru",
                "+79262587416", 25000, 39);
        persArray[4] = new Person("Popov Oleg", "Engineer", "kristofin@rambler.ru",
                "+79263254789", 11000, 77);

        System.out.println("Сотрудники старше 40 лет: ");
        System.out.println("");
        IntStream.range(0, persArray.length).filter(i -> persArray[i].age > 40).forEach(i -> persArray[i].info());
    }
}
